package com.vishnu.userManagementSystem.controller;


import com.vishnu.userManagementSystem.entities.User;
import com.vishnu.userManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
	@Autowired
	UserService userService;

	//addUser
	@PostMapping("user/new")
	public String addUser(@RequestBody User userItem){
		return userService.addUser(userItem);
	}

	//getUser
	@GetMapping("users/{id}")
	public Object getUserById(@PathVariable Integer id){
		return userService.getUserById(id);
	}

	//getAllUsers
	@GetMapping("users")
	public List<User> getAllUsers(){
		return userService.getUsers();
	}

	//updateUserInfo
	@PutMapping("users/update")
	public String updateUserInfo(@RequestBody User userInfo){
		return userService.updateUser(userInfo);
	}

	//deleteUser
	@DeleteMapping("users/delete/{id}")
	public String deleteUser(@PathVariable Integer id){
		return userService.deleteUser(id);
	}
}
