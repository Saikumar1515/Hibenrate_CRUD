package com.tek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CRUD {

	public static void main(String[] args) {
		
		Student s  = new Student();
		s.setRoll_no(2);
		s.setName("abc");
		s.setEmail("abc@gmail.com");
		s.setAge(24);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(s); // save object
//		manager.merge(s); // update object
//		manager.remove(s); //remove object
		transaction.commit();
	}
}
