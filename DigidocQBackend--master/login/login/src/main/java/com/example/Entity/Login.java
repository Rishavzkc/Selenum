package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //This represent login entity class
@Table(name="user") //(User is table name in database)


public class Login {

	@Id  
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	
	//No Args Constructor 
	Login() { }

	
	
    // Parameterized Constructors
	public Login(String email, String password, String name) {
	
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
	//getter and setter
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
