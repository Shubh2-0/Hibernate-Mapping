package com.masai.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int catId;
	
	@Column(name = "name")
	private String categoryName;

	@OneToMany
	@Cascade(CascadeType.ALL)
	@JoinTable(joinColumns =  @JoinColumn(name = "category_id"),inverseJoinColumns = @JoinColumn(name = "product_id"))
	List<Product> products;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
 

	
	
	public Category(String categoryName, List<Product> products) {
		super();
		this.categoryName = categoryName;
		this.products = products;
	}




	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
	
	
	public List<Product> getProducts() {
		return products;
	}




	public void setProducts(List<Product> products) {
		this.products = products;
	}




	@Override
	public String toString() {
		return "Category Id : " + catId + "\tCategory Name : " + categoryName + "\n Products : " + products + "\n=============\n";
	}





	

	
}
