package com.masai.dao;

import java.util.List;

import com.masai.exception.EmployeeAdharException;
import com.masai.model.AdharCard;

public interface AdharDao {

	String saveAdhar(AdharCard a) throws EmployeeAdharException;
	String deleteAdhar(int id) throws EmployeeAdharException;
	AdharCard getAdhar(int id) throws EmployeeAdharException;
	List<AdharCard> getAllAdhar() throws EmployeeAdharException;
	
	
	
	
}
