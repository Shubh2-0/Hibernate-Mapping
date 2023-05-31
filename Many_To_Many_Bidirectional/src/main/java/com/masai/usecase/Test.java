package com.masai.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utils.EM_Utils;

public class Test {
	
	
	
	public static void main(String[] args) {
		
	EntityManager em = EM_Utils.getConnection();
	
	
	List<Course> l = new ArrayList<Course>();
	List<Student> l2 = new ArrayList<Student>();
	
	l.add(new Course("Java Backend"));
	l.add(new Course("Android"));
	
	Student st = new Student();
	
	st.setName("Shubham");
	st.setSl(l);
	
	em.getTransaction().begin();
	em.persist(st);
	em.getTransaction().commit();
	em.close();
	
	
	
	
		
		
		
	}

}
