package oneToOne_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		
//		Bike bike = manager.find(Bike.class, 1);
//		System.out.println("bike id is: "+bike.getId());
//		System.out.println("bike name is: "+bike.getName());
//		System.out.println("bike cost is: "+bike.getCost());
//		
//		Engines eng = bike.getEngine();
//		
//		System.out.println("Engine id is: "+eng.getId());
//		System.out.println("engine type is: "+eng.getType());
//		System.out.println("engine cc is: "+eng.getCc());
		
		Engines engine = manager.find(Engines.class, 101);
		
		System.out.println("Engine id is: "+engine.getId());
		System.out.println("engine type is: "+engine.getType());
		System.out.println("engine cc is: "+engine.getCc());
		
		Bike bike = engine.getBike();

		System.out.println("bike id is: "+bike.getId());
		System.out.println("bike name is: "+bike.getName());
		System.out.println("bike cost is: "+bike.getCost());
		
		
		
				
		
			
		
	}

}
