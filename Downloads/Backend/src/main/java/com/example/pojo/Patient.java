package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="pid")
	int pid;
	
	@Column(name="pname")
	String pname;
	
	@Column(name = "email" )
	String email;

	@Column(name = "ppass")
	String password;
	
	@Column(name = "mobile")
	long mobile;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "age")
	int age;
	
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", address=" + address + ", age=" + age + ", bloodgrp=" + bloodgrp + ", gender=" + gender
				+ ", username=" + username + "]";
	}

	@Column(name = "bloodgroup")
	String bloodgrp;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "pusername")
	String username;
	
	public Patient() 
	{
		
	}
	
	public Patient(int pid, String pname, String email, String password, long mobile, String address, int age,
			String bloodgrp, String gender, String username) 
	{
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.age = age;
		this.bloodgrp = bloodgrp;
		this.gender = gender;
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodgrp() {
		return bloodgrp;
	}

	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
