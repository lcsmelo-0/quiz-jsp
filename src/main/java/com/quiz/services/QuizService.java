package com.quiz.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.models.Alternatives;
import com.quiz.models.Question;
import com.quiz.models.Quiz;
import com.quiz.models.Repostas;

@Service
public class QuizService {

	
	private List<Quiz> questions = new ArrayList<Quiz>(Arrays.asList(
			new Quiz("Qual a cor do camaro amarelo?", 1, 
					new ArrayList<Alternatives>(Arrays.asList(
							new Alternatives("Amarelo", true), new Alternatives("Preto", false)))),
			new Quiz("Qual cor do cavalo preto de Tom Pedro", 3, 
					new ArrayList<Alternatives>(Arrays.asList(
							new Alternatives("Branco", true), new Alternatives("Preto", false))))));
	
	public List<Quiz> getQuestions() {
		return questions;
	}
	
	public int countPoints(Repostas repostas) {
		int points = 0;
		for (Boolean respota : repostas.getCorrect()) {
			if (respota == true) {
				points++;
			}
		}
		return points;
	}
}
