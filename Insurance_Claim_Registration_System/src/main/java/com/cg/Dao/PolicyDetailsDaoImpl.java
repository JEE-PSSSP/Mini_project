package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entites.PolicyDetails;
import com.cg.util.JpaUtil;

public class PolicyDetailsDaoImpl implements IPolicyDetailsDao{
	private EntityManager manager;
	
	public PolicyDetailsDaoImpl() {
	manager =JpaUtil.getEntityManager();
	}

	public PolicyDetails getPolicyDetails(long policyNumber) {
		return manager.find(PolicyDetails.class, policyNumber);
		
	}

	public List<PolicyDetails> getAllPolicyDetails() {
		String str="SELECT pd From PolicyDetails pd";
		TypedQuery<PolicyDetails>query=manager.createQuery(str, PolicyDetails.class);
		return query.getResultList();
	}

	public void beginTranscation() {
		manager.getTransaction().begin();
		
	}

	public void commitTranscation() {
		manager.getTransaction().commit();
		
	}

}
	


