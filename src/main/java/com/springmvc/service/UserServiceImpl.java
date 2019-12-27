package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.intf.UserDao;
import com.springmvc.intf.UserService;
import com.springmvc.model.Auth;
import com.springmvc.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	public void register(User user) {
		userDao.register(user);
	}

	public User validateUser(Auth auth) {
		return userDao.validateUser(auth);
	}

}
