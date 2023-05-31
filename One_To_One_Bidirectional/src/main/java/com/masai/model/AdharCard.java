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
public class AdharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adhar_id")
	private int adId;
	
	@Column(name = "adhar_number")
	private String adharNum;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee em;
	
	public AdharCard() {
		// TODO Auto-generated constructor stub
	}

	public AdharCard(String adharNum, Employee em) {
		super();
		this.adharNum = adharNum;
		this.em = em;
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public String getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}

	public Employee getEm() {
		return em;
	}

	public void setEm(Employee em) {
		this.em = em;
	}

	@Override
	public String toString() {
		return em +"";
	}
	
	
	
	
	
}
