package com.cg.Dao;

import java.util.List;

import com.cg.entites.Claim;
import com.cg.entites.UserRole;

public interface IUserRoleDao {
	
	public boolean validateUserRole(String userName);
	public UserRole getUserRole(String userName);
	List<UserRole> getAllUserRoles();
	List<UserRole> findAllByclaim(Claim claim);
	void beginTransaction();
	void commitTransaction();

}
