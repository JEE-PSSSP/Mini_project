package com.cg.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.beans.Student;

public class TestApp_01 {

	public static void main(String[] args) {
		Student s1 = new Student( "charan", "charan@gmail.com");
		Student s2 = new Student( "sai", "sai@gmail.com");
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction txn = null;
		try {
			factory = Persistence.createEntityManagerFactory("Student");
			manager = factory.createEntityManager();
			
			txn= manager.getTransaction();
			txn.begin();
			
			manager.persist(s1);
			manager.persist(s2);
			
			System.out.println("Persisted s1 and s2");
			s1.setName("chandana");
			s1.setName("priya");
			s1.setName("swetha");
			
			System.out.println("Before commit");
			txn.commit();
			System.out.println("After commit");
			
			s1.setEmail("chandana@gmail.cocm");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
		

		

	}

}
