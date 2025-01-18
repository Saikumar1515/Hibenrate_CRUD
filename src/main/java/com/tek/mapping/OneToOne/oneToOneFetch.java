
package com.tek.mapping.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class oneToOneFetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		
		onetooneUniCar car = manager.find(onetooneUniCar.class, 1);
		
		System.out.println("--------------------------");
		
		System.out.println("Car id is: "+car.getId());
		System.out.println("Car name is: "+car.getName());
		System.out.println("Car cost is: "+car.getCost());
		
		OnetoOneUniEngine engine = car.getEngine();
		System.out.println("--------------------------");
		
		System.out.println("Engine id is: "+engine.getId());
		System.out.println("Engine type is: "+engine.getType());
		System.out.println("Engine cc is: "+engine.getCc());
	}
	
	

}
