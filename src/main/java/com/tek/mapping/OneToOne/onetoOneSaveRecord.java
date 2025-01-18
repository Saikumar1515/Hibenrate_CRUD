package com.tek.mapping.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class onetoOneSaveRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		onetooneUniCar car = new onetooneUniCar();
		car.setId(2);
		car.setName("KIA");
		car.setCost(200000);
		
		OnetoOneUniEngine engine = new OnetoOneUniEngine();
		engine.setId(102);
		engine.setType("k3");
		engine.setCc(1506);
		
		car.setEngine(engine);
		
		transaction.begin();
		manager.persist(car);
//		manager.persist(engine);
		transaction.commit();
				
	}

}
