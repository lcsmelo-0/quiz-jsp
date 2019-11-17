package com.quiz.models;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends Question {
	
	private ArrayList<Alternatives> alternatives;

	public Quiz(String questão, int pontuacao, ArrayList<Alternatives> alternatives) {
		super(questão, pontuacao);
		this.alternatives = alternatives;
	}

	public List<Alternatives> getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(ArrayList<Alternatives> alternatives) {
		this.alternatives = alternatives;
	}
	
	
	
}
