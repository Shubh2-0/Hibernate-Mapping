package com.masai.usecase;

import java.util.List;

import com.masai.dao.AdharDao;
import com.masai.dao.AdharDaoUImpl;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.model.AdharCard;
import com.masai.model.Employee;

public class Test {

	public static void main(String[] args) {
	
	EmployeeDao empDao = new EmployeeDaoImpl();	
	AdharDao adharDao = new AdharDaoUImpl();
		
	AdharCard a = new AdharCard();
	Employee e = new Employee();
	a.setAdharNum("37637362888");
	a.setEm(e);
	e.setName("Omkar");
	e.setAdhar(a);
	
	AdharCard a1 = new AdharCard();
	Employee e1 = new Employee();
	a1.setAdharNum("12354672883");
	a1.setEm(e1);
	e1.setName("Paras");
	e1.setAdhar(a1);
	
	
	
	try {
		
	empDao.saveEmployee(e1);
	
		
		
	} catch (Exception e2) {
		
		System.out.println(e2);
	}
	
	
	
		
	}
	
}
