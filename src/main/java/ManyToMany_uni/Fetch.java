package ManyToMany_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Stdnt std = manager.find(Stdnt.class, 1);
		List<Subject>sub = std.getSub();
		
		System.out.println("Studnent id is: "+std.getRoll_no());
		System.out.println("student name is: "+std.getName());
		System.out.println("student email is: "+std.getEmail());
		
		for(Subject subj : sub){
			System.out.println("Subject id is: "+subj.getId());
			System.out.println("subject name is: "+subj.getName());
			System.out.println("subject code is: "+subj.getCode());
		}
	}

}
