package oneToOne_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;
import javax.swing.text.TabableView;

public class Save {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bike bike = new Bike();
		bike.setId(1);
		bike.setName("R15");
		bike.setCost(100000);
		
		Engines eng = new Engines();
		eng.setId(123);
		eng.setType("K1A");
		eng.setCc(2000);
		
		bike.setEngine(eng);
		eng.setBike(bike);
		
		transaction.begin();
		manager.persist(bike);
		manager.persist(eng);
		transaction.commit();
		
	}

}
