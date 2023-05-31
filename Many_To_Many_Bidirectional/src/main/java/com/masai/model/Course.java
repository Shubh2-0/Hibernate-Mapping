package com.masai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;
	
	@Column(name = "course_name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "sl")
	List<Student> stl ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStl() {
		return stl;
	}

	public void setStl(List<Student> stl) {
		this.stl = stl;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course(String name, List<Student> stl) {
		super();
		this.name = name;
		this.stl = stl;
	}
	
	
}
