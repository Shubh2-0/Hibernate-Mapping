package com.masai.dao;

import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentDao {
	
	String saveStudent(Student st) throws StudentException;
	
	String deleteStudent(int id)throws StudentException;
	
	List<Student> getAllStudent() throws StudentException;
	
	Student getStudent(int id) throws StudentException;
	
	String updateStudent(int id, String name) throws StudentException;
	

}
