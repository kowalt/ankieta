package pl.jodkow.PollBE.pojo;

import java.util.Date;
import java.util.List;

public class Poll {
	private Date creationDate;
	private boolean isForAnonymous;
	private boolean areStatsPrivate;
	private List<Question> questions;
	private String title;

	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public boolean isForAnonymous() {
		return isForAnonymous;
	}
	public void setForAnonymous(boolean isForAnonymous) {
		this.isForAnonymous = isForAnonymous;
	}
	public boolean isAreStatsPrivate() {
		return areStatsPrivate;
	}
	public void setAreStatsPrivate(boolean areStatsPrivate) {
		this.areStatsPrivate = areStatsPrivate;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
