package com.tek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student s = manager.find(Student.class, 2);
		
		if(s!=null) {
			transaction.begin();
			manager.remove(s);
			transaction.commit();
			System.out.println("Record deleted");
		} else {
			System.out.println("no student record found");
		}
	}

}
