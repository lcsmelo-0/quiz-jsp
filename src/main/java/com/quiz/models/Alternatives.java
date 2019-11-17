package com.quiz.models;

public class Alternatives{

	private String alternative;
	private boolean correct;
	
	public Alternatives(String alternative, boolean correct) {
		this.alternative = alternative;
		this.correct = correct;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	@Override
	public String toString() {
		StringBuilder model = new StringBuilder();
		model.append(correct);
		return model.toString();
	}
		
}
