package com.masai.model;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String courseName;
	private String duration;
	
	
	
	public Certificate() {
		super();
	}

	public Certificate(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	} 

	@Override
	public String toString() {
		return "\nCourse Name : " + courseName + "\nDuration : " + duration + "\n================\n\n";
	}
	
}
