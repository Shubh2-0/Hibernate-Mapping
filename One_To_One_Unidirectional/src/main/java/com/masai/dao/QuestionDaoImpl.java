package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.QuestionAnswerException;
import com.masai.model.Question;
import com.masai.util.EM_Utils;

public class QuestionDaoImpl implements QuestionDao {

	@Override
	public String saveQuestion(Question q) throws QuestionAnswerException {
	
		if(q==null) throw new QuestionAnswerException("empty object");
		
	EntityManager em = EM_Utils.getConnection();
	Question q2 =null;
	q2 = em.find(Question.class, q.getQuesid());
	
	if(q2!=null)
		throw new QuestionAnswerException("this is already exist");
	
	em.getTransaction().begin();
	em.persist(q);
	em.getTransaction().commit();
	em.close();

		
		return "question saved";
	}

	
	
	@Override
	public String deleteQuestion(int id) throws QuestionAnswerException {
	
	EntityManager em = EM_Utils.getConnection();
	
	Question q = null;
	q = em.find(Question.class, id);
	
	if(q==null)
		throw new QuestionAnswerException("no question exist with this id");
	
	em.getTransaction().begin();
	em.remove(q);
	em.getTransaction().commit();
	em.close();
		
		
		return "question deleted";
	}

	
	
	@Override
	public List<Question> getAllQuestions() throws QuestionAnswerException {

		List<Question> l = null;
		
		EntityManager em = EM_Utils.getConnection();
		
		Query q = em.createQuery("select q from Question q");
		
		l = q.getResultList();
		
		if(l==null)
			throw new QuestionAnswerException("no question found");
	
		
		return l;
	}

	
	
	@Override
	public Question getQuestion(int id) throws QuestionAnswerException {
	
	Question q = null;
	
	EntityManager em = EM_Utils.getConnection();
	
	 q = em.find(Question.class, id);
	 
	 if(q==null)
		 throw new QuestionAnswerException("no question found with this id");
	 
	
		
		
		return q;
	}

}
