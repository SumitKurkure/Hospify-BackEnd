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
	String name;
	
	@Column(name = "email" )
	String email;

	@Column(name = "ppass")
	String password;
	
	@Column(name = "mobile")
	long mobno;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "age")
	int age;
	
	@Column(name = "bloodgroup")
	String bloodgroup;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "pusername")
	String username;
	
	public Patient() 
	{
		
	}
	
	
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", email=" + email + ", password=" + password + ", mobno="
				+ mobno + ", address=" + address + ", age=" + age + ", bloodgroup=" + bloodgroup + ", gender=" + gender
				+ ", username=" + username + "]";
	}


	public Patient(int pid, String name, String email, String password, long mobno, String address, int age,
			String bloodgroup, String gender, String username) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobno = mobno;
		this.address = address;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.username = username;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
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

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
