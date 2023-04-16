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

import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private int quesid;
	private String question;
   @OneToOne 
   @Cascade(CascadeType.ALL) 
   @JoinColumn(name = "answer_id")
	private Answer ans;
	
	
	
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Question(String question, Answer ans) {
		
		this.question = question;
		this.ans = ans;
	}



	public int getQuesid() {
		return quesid;
	}
	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}



	@Override
	public String toString() {
		return "\nQuestion ID : " + quesid + "\nQuestion : " + question + "?\n" + ans;
	}
	
	
	
	
	
	
	
	
}
