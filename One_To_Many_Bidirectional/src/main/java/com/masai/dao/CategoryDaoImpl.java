package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.model.Product;
import com.masai.util.EM_Utils;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public String addCategory(Category cat) throws CategoryException {
	
	if(cat==null) throw new CategoryException("empty object");
		
	EntityManager em = EM_Utils.getConnection();
	Category cat2 = null;
	
	cat2 = em.find(Category.class, cat.getId());
	
	if(cat2!=null)
		throw new CategoryException("this category already present");
	
	em.getTransaction().begin();
	em.persist(cat);
	em.getTransaction().commit();
	em.close();
	
		return "category saved";
	}

	
	
	@Override
	public String deleteCategory(int id) throws CategoryException {
	EntityManager em = EM_Utils.getConnection();
	Category cat = null;
	
	cat = em.find(Category.class, id);
	
	if(cat==null)
		throw new CategoryException("no category found with this id");
	
	em.getTransaction().begin();
	em.remove(cat);
	em.getTransaction().commit();
	em.close();
	
		return "deleted";
	}

	
	
	@Override
	public List<Product> getAllProducts(int id) throws CategoryException {
	EntityManager em = EM_Utils.getConnection();
	
	List<Product> l = null;
	
	Query q = em.createQuery("select c.products from Category c where c.catId = ?1");
	
	q.setParameter(1, id);
	
	l = q.getResultList();
	
	if(l==null)
		throw new CategoryException("no product found with this category");
	
	
		
		return l;
	}

	
	
	@Override
	public List<Category> getAllCategory() throws CategoryException {
	
	EntityManager em = EM_Utils.getConnection();
	
	List<Category> l = null;
	
	Query q = em.createQuery("select c from Category c");
	
	l = q.getResultList();
	
	if(l==null)
		throw new CategoryException("no category found");
		
		
		return l;
	}

	@Override
	public String addProducts(int id, Product p) throws CategoryException {

		EntityManager em = EM_Utils.getConnection();
		
		Category cat = em.find(Category.class, id);
		
		if(cat==null)
			throw new CategoryException("no category found with this id");
		
		cat.getProducts().add(p);
		
		em.getTransaction().begin();
		em.merge(cat);
		em.getTransaction().commit();
		em.close();
		
		
		
		
		
		return "product added";
	}

}
