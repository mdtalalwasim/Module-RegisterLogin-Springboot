package com.registration.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String fullName;
	
	private String gender;
	private String dateOfBirth;
	private String address;
	private String email;
	private String password;
	private String role;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fullName, String gender, String dateOfBirth, String address, String email,
			String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public User(String fullName, String gender, String dateOfBirth, String address, String email, String password) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
}
