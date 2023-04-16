package com.masai.usecase;

import java.util.List;

import com.masai.dao.QuestionDao;
import com.masai.dao.QuestionDaoImpl;
import com.masai.model.Answer;
import com.masai.model.Question;

public class Test {

	public static void main(String[] args) {
	
	QuestionDao qDao = new QuestionDaoImpl();
	Answer ans = new Answer("Java is a programming language");
	Question q = new Question("What is Java ?", ans);
	
	Answer ans2 = new Answer("MySQl is a kind of database management tool");
	Question q2 = new Question("What is MySQl ?", ans2);
	
	try {
		
//		List<Question> l = qDao.getAllQuestions();
//		
//		l.forEach(e -> System.out.println(e));
//		
		
         System.out.println(qDao.getQuestion(1));
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	
		
	}
	
}
