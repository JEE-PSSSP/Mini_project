package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static {
		factory = Persistence.createEntityManagerFactory("userrole");
	}
	public static EntityManager getEntityManager() {
		if(manager==null || !manager.isOpen()) {
			manager = factory.createEntityManager();
		}
		return manager;
	}
		
	protected JpaUtil() {
		super();
	
	}
	
	public static void cleanUp() {
		manager.close();
		factory.close();
	}
	
}
