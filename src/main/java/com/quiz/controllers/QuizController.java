package com.quiz.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.ls.LSInput;

import com.quiz.models.Alternatives;
import com.quiz.models.Quiz;
import com.quiz.models.Repostas;
import com.quiz.services.QuizService;

@Controller
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@GetMapping("/")
	public ModelAndView home(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("register.html");
		return modelAndView;
	}
	@PostMapping("/")
	public String register(HttpSession session, String name) {
		session.setAttribute("name", name);
		return "redirect:/quiz";
	}
	
	
	@GetMapping("/quiz")
	public ModelAndView quiz(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("index.html");
		modelAndView.addObject("questions", quizService.getQuestions());
		return modelAndView;
	}
	
	@PostMapping("/quiz")
	public String calcResult(HttpSession session, String name, Repostas respotas) {
		int points = quizService.countPoints(respotas);
		session.setAttribute("points", points);
		return "redirect:/result";
	}
	
	@GetMapping("/result")
	public ModelAndView result(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("result.html");
		StringBuilder mensagem = new StringBuilder();
		try {
			mensagem.append(session.getAttribute("name"));
			mensagem.append("\n");
			mensagem.append("Seus pontos foram: ");
			mensagem.append(session.getAttribute("points"));
		}catch (Exception e) {
			mensagem.append("Algo deu errado");
		}
		modelAndView.addObject("mensagem", mensagem);
		return modelAndView;
	}
}
