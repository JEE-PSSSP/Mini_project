package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entites.Policy;
import com.cg.util.JpaUtil;

public class PolicyDaoImpl implements IPolicyDao {
	
	private EntityManager manager;
	
	public PolicyDaoImpl() {
		manager =JpaUtil.getEntityManager();
	}

	public Policy getPOlicy(long policyNumber) {
		return manager.find(Policy.class, policyNumber);
		
	}

	public List<Policy> getAllPolicys() {
		String str="SELECT p FROM Policy p";
		TypedQuery<Policy>query=manager.createQuery(str, Policy.class);
		return query.getResultList();
	}

	public void beginTranscation() {
		manager.getTransaction().begin();
		
	}

	public void commitTranscation() {
		manager.getTransaction().commit();
		
	}

}
