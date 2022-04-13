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
	@Column(name ="DID")
	int did;
	
	@Column(name="dname")
	String name;
	
	@Column(name = "email" )
	String email;

	@Column(name = "dpass")
	String password;
	
	@Column(name = "mobile")
	Integer mobno;

	
	@Column(name = "speciality")
	String speciality;
	
	@Column(name = "availabletime")
	String availableTime;
	
	@Column(name = "fees") 
	Integer fees;
	
	@Column(name = "experience")
	String experience;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "gender")
	String gender;
	
	@Column(name = "hospadd")
	String hospadd;
	
	@Column(name = "dusername")
	String username;
	
	@Column(name="clinicvisit")
	String clinicVisit;
	
	@Column(name="degree")
	String degree;
	
	@Column(name = "hid")
	int hid;
	
	public int getHid() {
		return hid;
	}


	public void setHid(int hid) {
		this.hid = hid;
	}


	public void setFees(Integer fees) {
		this.fees = fees;
	}


	
	
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", email=" + email + ", password=" + password + ", mobno="
				+ mobno + ", speciality=" + speciality + ", availableTime=" + availableTime + ", fees=" + fees
				+ ", experience=" + experience + ", city=" + city + ", gender=" + gender + ", hospadd=" + hospadd
				+ ", username=" + username + ", clinicVisit=" + clinicVisit + ", degree=" + degree + ", hid=" + hid
				+ "]";
	}


	public Doctor(int did, String name, String email, String password, Integer mobno, String speciality,
			String availableTime, Integer fees, String experience, String city, String gender, String hospadd,
			String username, String clinicVisit, String degree, int hid) {
		super();
		this.did = did;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobno = mobno;
		this.speciality = speciality;
		this.availableTime = availableTime;
		this.fees = fees;
		this.experience = experience;
		this.city = city;
		this.gender = gender;
		this.hospadd = hospadd;
		this.username = username;
		this.clinicVisit = clinicVisit;
		this.degree = degree;
		this.hid = hid;
	}


	public int getDid() {
		return did;
	}




	public void setDid(int did) {
		this.did = did;
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




	public void setMobno(Integer mobno) {
		this.mobno = mobno;
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




	public String getExperience() {
		return experience;
	}




	public void setExperience(String experience) {
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




	public String getHospadd() {
		return hospadd;
	}




	public void setHospadd(String hospadd) {
		this.hospadd = hospadd;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getClinicVisit() {
		return clinicVisit;
	}




	public void setClinicVisit(String clinicVisit) {
		this.clinicVisit = clinicVisit;
	}




	public String getDegree() {
		return degree;
	}




	public void setDegree(String degree) {
	this.degree = degree;
	}




	public Doctor()
	{
		
	}
}