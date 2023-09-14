package com.vishnu.userManagementSystem.service;

import com.vishnu.userManagementSystem.entities.User;
import com.vishnu.userManagementSystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
	@Autowired
	UserRepo userRepo;

	public String addUser(User userItem) {
		userRepo.getUserList().add(userItem);
		return "added a new user";
	}

	public Object getUserById(Integer id) {
		for (User userItem: userRepo.getUserList()) {
			if (userItem.getUserId() == id){
				return userItem;
			}
		}
		return "Invalid id";
	}

	public List<User> getUsers() {
		return userRepo.getUserList();
	}

	public String updateUser(User userInfo) {
		for (User user:userRepo.getUserList()) {
			if (user.getUserId()==userInfo.getUserId()){
				user.setUserName(userInfo.getUserName());
				user.setName(userInfo.getName());
				user.setAddress(userInfo.getAddress());
				user.setPhoneNumber(userInfo.getPhoneNumber());
				return "user with id: "+userInfo.getUserId()+" has been updated!!";
			}
		}
		return "Invalid Id";
	}

	public String deleteUser(Integer id) {
		for (User user:userRepo.getUserList()) {
			if (user.getUserId()==id){
				userRepo.getUserList().remove(user);
				return "user with id: "+id+" removed successfully!!";
			}
		}
		return "Invalid userId";
	}
}
