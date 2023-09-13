package com.vishnu.userManagementSystem;

public class User {
	private int userId;
	private String name;
	private String userName;
	private String address;
	private int phoneNumber;

	public User(int userId, String name, String userName, String address, int phoneNumber) {
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
