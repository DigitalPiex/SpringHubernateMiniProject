package com.example.springsecurity.test.dao;

import com.example.springsecurity.test.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
