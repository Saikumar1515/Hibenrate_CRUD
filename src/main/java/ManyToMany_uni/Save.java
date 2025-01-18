package ManyToMany_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Stdnt s = new Stdnt();
		s.setRoll_no(1);
		s.setName("xyz");
		s.setEmail("xyz@gmail.com");
		
		Subject sb = new Subject();
		sb.setId(101);
		sb.setName("DAA");
		sb.setCode("CD123");
		
		Subject sb2 = new Subject();
		sb2.setId(102);
		sb2.setName("AOP");
		sb2.setCode("AOP123");
		
		Subject sb3 = new Subject();
		sb3.setId(3);
		sb3.setName("SE");
		sb3.setCode("SE345");
		
		List<Subject> sub = new ArrayList<Subject>();
		sub.add(sb);
		sub.add(sb2);
		sub.add(sb3);
		
		s.setSub(sub);
		
		transaction.begin();
		manager.persist(s);
		manager.persist(sb);
		manager.persist(sb2);
		manager.persist(sb3);
		transaction.commit();
		
		System.out.println("Data Saved");
	}
}