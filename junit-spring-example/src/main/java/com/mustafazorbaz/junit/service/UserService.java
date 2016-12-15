package com.mustafazorbaz.junit.service;

import com.mustafazorbaz.junit.model.User;

public interface UserService {

	public String getUserAbout();
	public String getUserStringCode();
	public User getUser(int id);
	public User createUser(User user);
	
	
}
