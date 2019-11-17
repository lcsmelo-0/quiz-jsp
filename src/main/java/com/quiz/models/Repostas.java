package com.quiz.models;

import java.util.List;

public class Repostas {
	
	private List<Boolean> correct;

	public Repostas(List<Boolean> correct) {
		this.correct = correct;
	}
	
	public void setCorrect(List<Boolean> correct) {
		this.correct = correct;
	}
	public List<Boolean> getCorrect() {
		return correct;
	}
	
	@Override
	public String toString() {
		StringBuilder model = new StringBuilder();
		for (Boolean boolean1 : correct) {
			model.append(boolean1);
		}
		return model.toString();
	}
}
