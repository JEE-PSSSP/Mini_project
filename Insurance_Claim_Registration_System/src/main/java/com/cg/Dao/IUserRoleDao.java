package com.cg.Dao;

import java.util.List;

import com.cg.entites.Claim;
import com.cg.entites.UserRole;

public interface IUserRoleDao {

	UserRole getUserRole(String userName);
	List<UserRole> getAllUserRoles();
	List<UserRole> findAllBycla(Claim claim);
//	void addUserRole(UserRole userrole);
//	void removeUserRole(UserRole userrole);
//	void updateUserRole(UserRole userrole);
	void beginTransaction();
	void commitTransaction();

}
