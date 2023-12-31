package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String userName;
	private String email;
	private String password;
	
	public User() {}
	public long getId() {
		return userId;
	}
	public void setId(long id) {
		this.userId = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(long id, String userName, String email, String password) {
		this.userId = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
}

