package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stId;
	private String name;
	private Certificate certi;
	
	
	
	
	public Student() {
		super();
	}




	public Student(String name, Certificate certi) {
		super();
		this.name = name;
		this.certi = certi;
	}




	public int getStId() {
		return stId;
	}




	public void setStId(int stId) {
		this.stId = stId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Certificate getCerti() {
		return certi;
	}




	public void setCerti(Certificate certi) {
		this.certi = certi;
	}




	@Override
	public String toString() {
		return "Student Id : " + stId + "\nName : " + name + certi;
	}
	
	
	
	
	
	
	
	
	

}
