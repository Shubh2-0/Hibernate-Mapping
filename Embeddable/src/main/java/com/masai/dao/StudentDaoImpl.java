package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.util.EM_Utils;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String saveStudent(Student st) throws StudentException {
	
	if(st==null) throw new StudentException("object is null");
		
		
	EntityManager em = EM_Utils.getConnection();
	
	Student st2 = null;
	
	st2 = em.find(Student.class, st.getStId());
	if(st2!=null)
		throw new StudentException("student already present with this id");
	
	em.getTransaction().begin();
	em.persist(st);
	em.getTransaction().commit();
	em.close();
	
		return "student saved";
	}

	
	
	@Override
	public String deleteStudent(int id) throws StudentException {	
	Student st = null;	
	
	EntityManager em = EM_Utils.getConnection();
	
	st = em.find(Student.class, id);
	
	if(st==null)
		throw new StudentException("no student found with this id");
	
	em.getTransaction().begin();
	em.remove(st);
	em.getTransaction().commit();
	em.close();
	
		
		
		return "deleted successfully";
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
	
	EntityManager em = EM_Utils.getConnection();
	
	List<Student> st = null;
	
	Query q = em.createQuery("select st from Student st");
	
	st = q.getResultList();
	
	if(st.size()==0)
		throw new StudentException("no student found");	
		
		
	em.close();
		return st;
		
	}

	@Override
	public Student getStudent(int id) throws StudentException {
	
	Student st =null;
	EntityManager em = EM_Utils.getConnection();
	
	st = em.find(Student.class, id);
	
	if(st==null)
		throw new StudentException("student not found with that id");

	em.close();
	return st;
	}
	
	

	@Override
	public String updateStudent(int id, String name) throws StudentException {
	EntityManager em = EM_Utils.getConnection();
	Student st =null;
	
	st = em.find(Student.class, id);
	
	if(st==null)
		throw new StudentException("no student found with this id");
	
	st.setName(name);
	em.getTransaction().begin();
	em.merge(st);
	em.getTransaction().commit();

		em.close();
		return "updated successfully";
	}

}
