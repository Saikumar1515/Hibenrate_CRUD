package com.tek.many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		
		Review r = manager.find(Review.class, 1);
		System.out.println("Review ID is: "+r.getId());
		System.out.println("Review heading is: "+r.getHeading());
		System.out.println("Review message is: "+r.getMessage());
		
		Product p = r.getProduct();
		System.out.println("----------------------");
		System.out.println("Product id is: "+p.getId());
		System.out.println("Product name is: "+p.getName());
		System.out.println("Product cost is: "+p.getCost());
	}

}
