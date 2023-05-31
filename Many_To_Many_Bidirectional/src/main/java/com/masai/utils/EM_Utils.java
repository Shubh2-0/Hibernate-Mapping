package com.masai.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EM_Utils {
	
	
	static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("masaiUnit"); 
	
	
	public static EntityManager getConnection() {
		
		return emf.createEntityManager();
		
	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println(EM_Utils.getConnection());
//	}

	
}
