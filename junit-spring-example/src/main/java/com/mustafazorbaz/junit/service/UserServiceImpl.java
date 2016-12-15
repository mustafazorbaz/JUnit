package com.mustafazorbaz.junit.service;

import java.util.Date;
import java.util.Random;

import com.mustafazorbaz.junit.model.User;

public class UserServiceImpl implements UserService {

	public String getUserAbout() {
		User existingUser = new User();
		existingUser.setAbout("User for XYZ in units");
		return "About:" + existingUser.getAbout();
	}

	public String getUserStringCode() {
		User existingUser = new User();
		existingUser.setSecurityCode("MZBZ");
		return "Account Code: " + existingUser.getSecurityCode();
	}
	
	public User createUser(User user) {
		User newUser = new User();
		newUser.setUserId(new Random().nextInt());
		newUser.setSecurityCode("XYZ");
		newUser.setUserStatus("INITIATED");
		newUser.setCreateDate(new Date());
		return newUser;
	}
	
	public User getUser(int id) {
		User newUser = new User();
		newUser.setUserId(new Random().nextInt());
		newUser.setSecurityCode("XYZ");
		newUser.setUserStatus("COMPLETED");
		newUser.setCreateDate(new Date());
		newUser.setAbout("This is the new XYZ user");
		return newUser;
	}
	
	

}
