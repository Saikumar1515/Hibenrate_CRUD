package com.tek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = manager.find(Student.class, 1);
		
		if(s!=null) {
			s.setName("PQR");
			transaction.begin();
			manager.merge(s);
			transaction.commit();
			System.out.println("Record Updated");
		} else {
			System.out.println("Student details doesn't exist");
		}
		
		
	}

}
