package com.example.springsecurity.test.service;

import com.example.springsecurity.test.entity.User;
import com.example.springsecurity.test.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
