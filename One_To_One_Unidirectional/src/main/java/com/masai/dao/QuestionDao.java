package com.masai.dao;

import java.util.List;

import com.masai.exception.QuestionAnswerException;
import com.masai.model.Question;

public interface QuestionDao {
	
	String saveQuestion(Question q) throws QuestionAnswerException;
	String deleteQuestion(int id) throws QuestionAnswerException;
	List<Question> getAllQuestions() throws QuestionAnswerException;
	Question getQuestion(int id) throws QuestionAnswerException;
	
	

}
