package com.ncu.jdbcDemo.dao;

import java.util.List;

import com.ncu.jdbcDemo.models.User;

public interface UserDao {

	    public void saveOrUpdate(User user);
	     
	    public void delete(String email);
	     
	    public User get(String email);
	     
	    public List<User> list();
	
}
