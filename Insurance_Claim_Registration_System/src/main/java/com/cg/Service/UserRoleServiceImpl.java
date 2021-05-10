package com.cg.Service;

import java.util.List;

import com.cg.Dao.IUserRoleDao;
import com.cg.Dao.UserRoleDaoImpl;
import com.cg.entites.UserRole;

public  class UserRoleServiceImpl implements IUserRoleService{
	IUserRoleDao userDao=new UserRoleDaoImpl();
	

	public UserRole getUserRole(String userName) {
		return userDao.getUserRole(userName);
	}

	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		return null;
	}
}
