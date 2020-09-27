package com.example.springsecurity.test.dao;

import com.example.springsecurity.test.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
