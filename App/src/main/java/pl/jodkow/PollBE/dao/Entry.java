package pl.jodkow.PollBE.dao;

public class Entry {
	private String keyInMongoDB;
	private String value;
	
	public String getKeyInMongoDB() {
		return keyInMongoDB;
	}
	public void setKeyInMongoDB(String keyInMongoDB) {
		this.keyInMongoDB = keyInMongoDB;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
