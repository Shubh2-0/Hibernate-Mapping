package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int empId;
	private String name;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL,mappedBy = "em")
	
	private AdharCard adhar;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AdharCard getAdhar() {
		return adhar;
	}

	public void setAdhar(AdharCard adhar) {
		this.adhar = adhar;
	}

	public Employee(String name, AdharCard adhar) {
		super();
		this.name = name;
		this.adhar = adhar;
	}

	@Override
	public String toString() {
		return "Employee Id : " + empId + "\nName : " + name + "\nAdharId  : " + adhar.getAdId() + "\nAdhar Number : "+adhar.getAdharNum()+"\n============\n";
	}
	
	
	
	
	
	
}
