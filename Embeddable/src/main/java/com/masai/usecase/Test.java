package com.masai.usecase;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.Certificate;
import com.masai.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
	
	StudentDao stDao = new StudentDaoImpl();
	
	Certificate sr = new Certificate("Java Backend Development", "6 Months");
	Certificate sr2 = new Certificate("Android Development", "10 Months");
	Certificate sr3 = new Certificate("Data Analytics", "15 Months");
	Student st = new Student("Shubham Bhati", sr);
	Student st2 = new Student("Karan Ahuja", sr2);
	Student st3 = new Student("Arjun Mehta", sr3);
	

	
	try {
		
   
		
	List<Student> l = stDao.getAllStudent();
	
	l.forEach(e -> System.out.println(e));
  
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	
		
		
		
	}

}
