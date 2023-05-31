package com.masai.usecase;

import java.util.ArrayList;
import java.util.List;

import com.masai.dao.CategoryDao;
import com.masai.dao.CategoryyDaoImpl;
import com.masai.model.Category;
import com.masai.model.Product;

public class Test {
	
	public static void main(String[] args) {
		
		
		CategoryDao cDao = new CategoryyDaoImpl();
		
		Product p1 = new Product("Pen");
		Product p2 = new Product("Pencil");
		Product p3 = new Product("Rubber");
		Product p4 = new Product("Scale");
		
		List<Product> l = new ArrayList<>();
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		Category cat1 = new Category("Stationary", l);
		
		
		Product p11 = new Product("RealMe 3");
		Product p22 = new Product("Samsung LED Tv 70 inch");
		Product p33 = new Product("MI Laptop");
		Product p44 = new Product("SmartBuy Trimmer");
		
		List<Product> l2 = new ArrayList<>();
		
		l2.add(p11);
		l2.add(p22);
		l2.add(p33);
		l2.add(p44);
		
		Category cat2 = new Category("Electronics", l2);
		
		
		try {
			
		List<Product> list = cDao.getAllProducts(2);
		
		System.out.println(list);
		
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
