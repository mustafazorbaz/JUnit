package com.mustafazorbaz.junit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mustafazorbaz.junit.service.UserService;
import com.mustafazorbaz.junit.service.UserServiceImpl;

@Configuration
public class Config {
	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
}
