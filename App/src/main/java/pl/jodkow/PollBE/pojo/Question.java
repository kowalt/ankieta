package pl.jodkow.PollBE.pojo;

import java.util.List;

public class Question {
	private String title;
	private QuestionTypeEnum type;
	private List<String> possibleAnswers;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public QuestionTypeEnum getType() {
		return type;
	}
	public void setType(QuestionTypeEnum type) {
		this.type = type;
	}
	public List<String> getPossibleAnswers() {
		return possibleAnswers;
	}
	public void setPossibleAnswers(List<String> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
}
