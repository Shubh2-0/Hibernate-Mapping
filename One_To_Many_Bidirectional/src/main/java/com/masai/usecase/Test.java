package com.masai.usecase;

import java.util.ArrayList;
import java.util.List;

import com.masai.dao.CategoryDao;
import com.masai.dao.CategoryDaoImpl;
import com.masai.model.Category;
import com.masai.model.Product;

public class Test {

	public static void main(String[] args) {
	
		CategoryDao cDao = new CategoryDaoImpl();
	
		List<Product> l = new ArrayList<>();
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		Category c1 = new Category();
		
		
		p1.setName("Sugar");
		p1.setCat(c1);
		p2.setName("Tea");
		p2.setCat(c1);
		
		c1.setName("Grocery");
		c1.setProducts(l);
		
		

		try {
			
			cDao.addCategory(c1);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}
