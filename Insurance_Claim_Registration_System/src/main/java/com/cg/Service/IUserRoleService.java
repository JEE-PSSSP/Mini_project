package com.cg.Service;

import java.util.List;


import com.cg.entites.UserRole;

public interface IUserRoleService {
	UserRole getUserRole(String userName);
	List<UserRole> getAllUserRoles();

}
