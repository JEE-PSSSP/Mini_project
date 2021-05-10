package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entites.Claim;
import com.cg.entites.UserRole;
import com.cg.util.JpaUtil;

public class UserRoleDaoImpl implements IUserRoleDao{
	
	private EntityManager manager;
	
	public UserRoleDaoImpl() {
		manager =JpaUtil.getEntityManager();
	}
	
	public UserRole getUserRole(String userName){
		return manager.find(UserRole.class, userName);
	}

	public List<UserRole> getAllUserRoles() {
		String str ="SELECT u FROM UserRole u";
		TypedQuery<UserRole>query=manager.createQuery(str,UserRole.class);
		return query.getResultList();
	}

	public void beginTransaction() {
		manager.getTransaction().begin();
			
	}
	
	public void commitTransaction() {
		manager.getTransaction().commit();
		
	}

	public List<UserRole> findAllBycla(Claim claim) {
		String str="Select u from UserRole where u.claim=:claim";
		TypedQuery<UserRole>query=manager.createQuery(str, UserRole.class);
		query.setParameter(1, claim);
		return query.getResultList();
	}
	
}
