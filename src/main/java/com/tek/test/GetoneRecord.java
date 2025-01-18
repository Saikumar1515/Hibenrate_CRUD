package com.tek.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetoneRecord {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		Student s = manager.find(Student.class, 2);
		
		if(s != null) {
			System.out.println("Roll Number is: "+s.getRoll_no());
			System.out.println("Student Name is: "+s.getName());
			System.out.println("Student age is : "+s.getAge());
			System.out.println("student email is: "+s.getEmail());
		} else {
			System.out.println("please enter a valid Student Details");
		}
		
	}
}
