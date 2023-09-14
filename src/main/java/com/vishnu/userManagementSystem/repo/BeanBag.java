package com.vishnu.userManagementSystem.repo;

import com.vishnu.userManagementSystem.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class BeanBag {
	@Bean
	public List<User> createUser(){
		return new ArrayList<>();
	}
}
