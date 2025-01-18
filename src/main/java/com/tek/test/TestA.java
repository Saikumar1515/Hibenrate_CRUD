package com.tek.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestA {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(factory);
	}

}
