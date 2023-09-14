package com.vishnu.userManagementSystem.repo;

import com.vishnu.userManagementSystem.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepo {
	@Autowired
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}
}
