package com.masai.dao;

import java.util.List;

import com.masai.exception.CategoryException;
import com.masai.model.Category;
import com.masai.model.Product;

public interface CategoryDao {

	
	
	String addCategory(Category cat) throws CategoryException;
	String deleteCategory(int id) throws CategoryException;
	List<Product> getAllProducts(int id) throws CategoryException;
	List<Category> getAllCategory() throws CategoryException;
	String addProducts(int id,Product p) throws CategoryException;
	
	
}
