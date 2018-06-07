package pl.jodkow.PollBE.pojo;

import java.util.List;

public class User extends MongoPOJO {
	private String login;
	private String password;
	private List<Poll> polls;
	private String email;

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Poll> getPolls() {
		return polls;
	}
	public void setPolls(List<Poll> polls) {
		this.polls = polls;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
