package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entites.Claim;
import com.cg.util.JpaUtil;


public class ClaimDaoImpl implements IClaimDao {
	private EntityManager manager;
	
	public ClaimDaoImpl() {
		manager =JpaUtil.getEntityManager();
	}
	
	
	public Claim getClaim(long claimNumber) {
		return manager.find(Claim.class, claimNumber);
	}

	public List<Claim> getAllClaims() {
		String str ="SELECT c FROM Claim c";
		TypedQuery<Claim>query = manager.createQuery(str, Claim.class);
		return query.getResultList(); 
	}

	public void beginTransaction() {
		manager.getTransaction().begin();
			
	}

	public void commitTransaction() {
		manager.getTransaction().commit();
	
		
	}

}
