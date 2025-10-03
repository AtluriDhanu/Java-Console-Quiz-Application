package quiz;

import java.util.List;

public class QuizQuestion {
	
	private String question;
	private List<String> options;
	private int correctoption;
	
	public QuizQuestion (String question, List<String> options, int correctoption) {
		this.question = question;
		this.options = options;
		this.correctoption = correctoption;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getOptions() {
		return options;
	}

	public int getCorrectoption() {
		return correctoption;
	}	
}
