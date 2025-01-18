package com.tek.onetoMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		
		Bank bank = manager.find(Bank.class, 1);
		System.out.println("Bank id is: "+bank.getId());
		System.out.println("Bank name is: "+bank.getName());
		System.out.println("Bank IFSC code is: "+bank.getIFSC());
		
		List<Account> accounts = bank.getAccounts();
		System.out.println("==============================");
		for(Account account: accounts) {
			System.out.println("account id  is: "+account.getId());
			System.out.println("account number is: "+account.getNumber());
			System.out.println("account balance is: "+account.getBalance());
		}
		
	}

}
