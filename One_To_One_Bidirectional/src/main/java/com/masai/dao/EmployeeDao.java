package com.masai.dao;

import java.util.List;

import com.masai.exception.EmployeeAdharException;
import com.masai.model.AdharCard;
import com.masai.model.Employee;

public interface EmployeeDao {

	
	String saveEmployee(Employee a) throws EmployeeAdharException;
	String deleteEmployee(int id) throws EmployeeAdharException;
	Employee getEmployee(int id) throws EmployeeAdharException;
	List<Employee> getAllEmployee() throws EmployeeAdharException;
	
	
	
}
