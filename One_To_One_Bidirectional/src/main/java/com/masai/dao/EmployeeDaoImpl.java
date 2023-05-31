package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;

import com.masai.exception.EmployeeAdharException;
import com.masai.model.Employee;
import com.masai.util.EM_Utils;

public class EmployeeDaoImpl implements EmployeeDao {

	public String saveEmployee(Employee a) throws EmployeeAdharException {
	
	EntityManager em = EM_Utils.getConnection();
	
	Employee emp = null;
			emp = em.find(Employee.class, a.getEmpId());
	
	if(emp!=null)
	    throw new EmployeeAdharException("employee already exist with this id");
	
	em.getTransaction().begin();
	em.persist(a);
	em.getTransaction().commit();
	em.close();
		
		
		return "emplyee added";
	}

	
	
	public String deleteEmployee(int id) throws EmployeeAdharException {
	
	EntityManager em = EM_Utils.getConnection();
	
	Employee emp = null;
	
	emp = em.find(Employee.class, id);
	
	if(emp==null)
		throw new EmployeeAdharException("no emplyee found with this id");
	
	em.getTransaction().begin();
	em.remove(emp);
	em.getTransaction().commit();
	em.close();

	
	
	
	
	
		
		
		return "deleted";
	}

	
	
	public Employee getEmployee(int id) throws EmployeeAdharException {
		EntityManager em = EM_Utils.getConnection();
		Employee emp = null;
		emp = em.find(Employee.class, id);
		
		if(emp==null)
			throw new EmployeeAdharException("no emplyee found with this id");
		
		
		
		return emp;
	}

	public List<Employee> getAllEmployee() throws EmployeeAdharException {
	
	EntityManager em = EM_Utils.getConnection();
	
	List<Employee> l = null;
	
	Query q = em.createQuery("select e from Employee e");
	
	l = q.getResultList();
	
	if(l.size() == 0)
		throw new EmployeeAdharException("no employee found");
	
	
		
		return l;
	}

}
