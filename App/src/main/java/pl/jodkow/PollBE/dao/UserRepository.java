package pl.jodkow.PollBE.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.jodkow.PollBE.pojo.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByLogin(String login);
}
