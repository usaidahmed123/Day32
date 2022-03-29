package com.day32;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager man = fact.createEntityManager();
		man.getTransaction().begin();
		Student stud = new Student();
		stud.setStudentName("jawad");
		
		
		Address add = new Address();
		add.setCity("bangalore");
		add.setState("karnataka");
		
		
		stud.setAddress(add);
		
		
		man.persist(stud);
		man.getTransaction().commit();
		
		
		System.out.println("Added one address to student");
		man.close();
		fact.close();
		
	}

}
