package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.EmployeeAdharException;
import com.masai.model.AdharCard;
import com.masai.model.Employee;
import com.masai.util.EM_Utils;

public class AdharDaoUImpl implements AdharDao {

	public String saveAdhar(AdharCard a) throws EmployeeAdharException {
		EntityManager em = EM_Utils.getConnection();
		
		AdharCard adhr = null;
		adhr = em.find(AdharCard.class, a.getAdId());
		
		if(adhr!=null)
		    throw new EmployeeAdharException("adhar mismatched");
		
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
			
			
			return "adhar added";
	}

	public String deleteAdhar(int id) throws EmployeeAdharException {

		EntityManager em = EM_Utils.getConnection();
		
		AdharCard adhr = null;
		
		adhr = em.find(AdharCard.class, id);
		
		if(adhr==null)
			throw new EmployeeAdharException("no adhar card found with this id");
		
		em.getTransaction().begin();
		em.remove(adhr);
		em.getTransaction().commit();
		em.close();

		
		
		
		
		
			
			
			return "deleted";
	}

	public AdharCard getAdhar(int id) throws EmployeeAdharException {
		
		EntityManager em = EM_Utils.getConnection();
		
		AdharCard adhr = null;
		
		adhr = em.find(AdharCard.class, id);
		
		if(adhr==null)
			throw new EmployeeAdharException("no adhar card found with this id");
		
		
		
		return adhr;
	}

	public List<AdharCard> getAllAdhar() throws EmployeeAdharException {
		
		
		EntityManager em = EM_Utils.getConnection();
		
		List<AdharCard> l = null;
		
		Query q = em.createQuery("select a from AdharCard a");
		
		l = q.getResultList();
		
		if(l.size() == 0)
			throw new EmployeeAdharException("no adhar found");
		
		
			
			return l;
	}

}
