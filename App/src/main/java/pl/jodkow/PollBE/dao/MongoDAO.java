package pl.jodkow.PollBE.dao;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import pl.jodkow.PollBE.pojo.MongoPOJO;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.and;


public abstract class MongoDAO<T extends MongoPOJO> implements DAO<T>{
	
	private MongoClient mongoClient;
	private MongoDatabase database = mongoClient.getDatabase("mydb");
	private CodecRegistry pojoCodecRegistry;	
	private MongoCollection<T> collection;
	
	public MongoDAO(Class<T> typeParameterClass)
	{
		mongoClient = MongoClients.create("mongodb://polls-shard-00-00-hybh0.mongodb.net:27017");
		pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
	            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		database = mongoClient.getDatabase("polls").withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection(typeParameterClass.getName().toLowerCase(), typeParameterClass);
	}

	@Override
	public void add(T item) {
		collection.insertOne(item);
	}

	@Override
	public void update(T item) {
		collection.replaceOne(eq("_id",item.getID()), item);
	}

	@Override
	public void remove(T item) {
		collection.deleteOne(eq("_id",item.getID()));
	}

	/**
	 * Not type-safe!
	 */
	@Override
	public T get(List<Entry> keys) {
		List<Bson> filters = new ArrayList<>();

		for(final Entry entry: keys)	
			filters.add(eq(entry.getKeyInMongoDB(),entry.getValue()));
	
		return (T)collection.find(and(filters));
	}
}
