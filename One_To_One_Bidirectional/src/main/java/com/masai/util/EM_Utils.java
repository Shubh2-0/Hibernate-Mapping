package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EM_Utils {
	
	public static final EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("masaiUnit");
		
	}
	
	public static EntityManager getConnection() {
	
		return emf.createEntityManager();
	 
	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println(EM_Utils.getConnection());
//		
//	}
//	

}
