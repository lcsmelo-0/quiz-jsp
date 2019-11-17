package com.quiz.models;

public class Question {
	
	private String question;
	private int point;
	
	public Question(String questão, int pontuacao) {
		this.question = questão;
		this.point = pontuacao;
	}
	
	public int getPoint() {
		return point;
	}
	public String getQuestion() {
		return question;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		StringBuilder model = new StringBuilder();
		model.append("Questão: ");
		model.append(this.question);
		model.append("Vale: ");
		model.append(this.point);
		return model.toString();
	}
}
