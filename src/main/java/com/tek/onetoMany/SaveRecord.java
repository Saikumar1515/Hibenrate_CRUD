
package com.tek.onetoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = new Bank();
		bank.setId(1);
		bank.setName("SBI");
		bank.setIFSC("SIBIN164009");
		
		Account acc = new Account();
		acc.setId(101);
		acc.setNumber(1244651351);
		acc.setBalance(1500);
		
		Account acc2 = new Account();
		acc2.setId(102);
		acc2.setNumber(1244651);
		acc2.setBalance(1800);
		
		Account acc3 = new Account();
		acc3.setId(103);
		acc3.setNumber(124465581);
		acc3.setBalance(18000);
		
		List<Account>accounts = new ArrayList<Account>();
		accounts.add(acc);
		accounts.add(acc2);
		accounts.add(acc3);
		
		bank.setAccounts(accounts);
		
		transaction.begin();
		manager.persist(bank);
		manager.persist(acc);
		manager.persist(acc2);
		manager.persist(acc3);
		transaction.commit();
	}
}
