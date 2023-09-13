package com.vishnu.userManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
	@Autowired
	List<User> userList;

	//addUser
	@PostMapping("user/new")
	public String addUser(@RequestBody User userItem){
		userList.add(userItem);
		return "added a new user";
	}

	//getUser
	@GetMapping("users/{id}")
	public Object getUserById(@PathVariable Integer id){
		for (User userItem:userList) {
			if (userItem.getUserId() == id){
				return userItem;
			}
		}
		return "Invalid id";
	}

	//getAllUsers
	@GetMapping("users")
	public List<User> getAllUsers(){
		return userList;
	}

	//updateUserInfo
	@PutMapping("users/update")
	public String updateUserInfo(@RequestBody User userInfo){
		for (User user:userList) {
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

	//deleteUser
	@DeleteMapping("users/delete/{id}")
	public String deleteUser(@PathVariable Integer id){
		for (User user:userList) {
			if (user.getUserId()==id){
				userList.remove(user);
				return "user with id: "+id+" removed successfully!!";
			}
		}
		return "Invalid userId";
	}
}
