package com.mustafazorbaz.junit;

import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.mustafazorbaz.junit.config.Config;
import com.mustafazorbaz.junit.model.User;
import com.mustafazorbaz.junit.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class,loader=AnnotationConfigContextLoader.class)
public class JUnitUserTest {
	@Autowired
	private UserService userService;
	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <-----");
	}
	@Test
	public void testUserService() {
		assertEquals("class com.mustafazorbaz.junit.service.UserServiceImpl",this.userService.getClass().toString());
	}	
	@Test
	public void testUserServiceGetAccountDescription() {
		assertTrue(userService.getUserAbout().contains("About:"));
	}	
	@Test
	public void testUserServiceGetAccountCode() { 
		assertTrue(userService.getUserStringCode().contains("Code:"));
	}	
	@Test
	public void testUserServiceCreateNewUser() {
		User newUser = new User();
		newUser.setSecurityCode("XYZ");
		newUser.setAbout("About");
		if(newUser != null) {
			assertThat(userService.createUser(newUser), instanceOf(User.class));
			assertNotNull("Security isn't null", newUser.getSecurityCode());
			assertNotNull("About isn't not null", newUser.getAbout());
		}
		
		assertNotNull("New User is not null", newUser);		
	}	
	@Test
	public void testUserServiceGetUser() {
		User existingUser = userService.getUser(0);
		if(existingUser != null) {
			assertThat(userService.getUser(0), instanceOf(User.class));
			assertNotNull("Security isn't null", existingUser.getSecurityCode());
			assertNotNull("Description isn't null", existingUser.getAbout());
		}
		assertNotNull("Object is not null", existingUser);
	}	
	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}
}
