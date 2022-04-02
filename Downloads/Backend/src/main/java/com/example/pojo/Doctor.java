package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="did")
	int pid;
	
	@Column(name="dname")
	String pname;
	
	@Column(name = "email" )
	String email;

	@Column(name = "dpass")
	String password;
	
	@Column(name = "mobile")
	long mobile;
	
	@Column(name = "hid")
	int hospId;
	
	@Column(name = "speciality")
	String speciality;
	
	@Column(name = "availabletime")
	String availableTime;
	
	@Column(name = "fees") 
	int fees;
	
	@Column(name = "experience")
	int experience;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "hospadd")
	String hospAddress;

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

	public int getHospId() {
		return hospId;
	}

	public void setHospId(int hospId) {
		this.hospId = hospId;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHospAddress() {
		return hospAddress;
	}

	public void setHospAddress(String hospAddress) {
		this.hospAddress = hospAddress;
	}

	public Doctor(int pid, String pname, String email, String password, long mobile, int hospId, String speciality,
			String availableTime, int fees, int experience, String city, String gender, String hospAddress) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.hospId = hospId;
		this.speciality = speciality;
		this.availableTime = availableTime;
		this.fees = fees;
		this.experience = experience;
		this.city = city;
		this.gender = gender;
		this.hospAddress = hospAddress;
	}
	
	public Doctor()
	{
		
	}
}
