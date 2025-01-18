package com.tek.many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Product p = new Product();
		p.setId(1);
		p.setName("Redmi Note 9 pro");
		p.setCost(14000);
		
		Review r = new Review();
		r.setId(1);
		r.setHeading("Good");
		r.setMessage("Fetaures are good");
		r.setProduct(p);
		
		Review r2 = new Review();
		r2.setId(2);
		r2.setHeading("Better");
		r2.setMessage("camera Quality is Good");
		r2.setProduct(p);
		
		transaction.begin();
		manager.persist(p);
		manager.persist(r);
		manager.persist(r2);
		transaction.commit();
	}

}
