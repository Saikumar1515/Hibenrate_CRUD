package com.tek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

public class FetchAllRecords {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("select s from Student s");
		List<Student> s = q.getResultList();
		for(Student std : s) {
			System.out.println("ROll Number is "+std.getRoll_no());
			System.out.println("Age is "+std.getAge());
			System.out.println("Name is "+std.getName());
			System.out.println("Email is "+std.getEmail());
			
			System.out.println("-------------------------------------");
		}
		
	}

}
