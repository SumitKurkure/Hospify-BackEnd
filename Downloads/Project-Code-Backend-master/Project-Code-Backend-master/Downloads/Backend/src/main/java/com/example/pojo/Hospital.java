package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="hospid")
	int hospid;
	
	@Column(name="hospname")
	String hospname;
	
	@Column(name="hospadd")
	String hospadd;
	
	@Column(name="city")
	String city;
	
	@Column(name="availabletime")
	String availabletime;
	
	@Column(name="mobileno")
	int mobileno;
	
	@Column(name="icubed")
	int icubed;
	
	@Column(name="normalbed")
	int normalbed;
	
	@Column(name="treatmenttype")
	String treatmenttype;
	
	@Column(name="gov_or_private")
	String gov_or_private;
	
	@Column(name="fees")
	float fees;
	
	@Column(name="labavailable_OR_not")
	String labavailable_or_not;
	
	@Column(name="email")
	String email;
	
	public int getHospid() {
		return hospid;
	}
	public void setHospid(int hospid) {
		this.hospid = hospid;
	}
	public String getHospname() {
		return hospname;
	}
	public void setHospname(String hospname) {
		this.hospname = hospname;
	}
	public String getHospadd() {
		return hospadd;
	}
	public void setHospadd(String hospadd) {
		this.hospadd = hospadd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAvailabletime() {
		return availabletime;
	}
	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getIcubed() {
		return icubed;
	}
	public void setIcubed(int icubed) {
		this.icubed = icubed;
	}
	public int getNormalbed() {
		return normalbed;
	}
	public void setNormalbed(int normalbed) {
		this.normalbed = normalbed;
	}
	public String getTreatmenttype() {
		return treatmenttype;
	}
	public void setTreatmenttype(String treatmenttype) {
		this.treatmenttype = treatmenttype;
	}
	public String getGov_or_private() {
		return gov_or_private;
	}
	public void setGov_or_private(String gov_or_private) {
		this.gov_or_private = gov_or_private;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public String getLabavailable_or_not() {
		return labavailable_or_not;
	}
	public void setLabavailable_or_not(String labavailable_or_not) {
		this.labavailable_or_not = labavailable_or_not;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hospital(int hospid, String hospname, String hospadd, String city, String availabletime, int mobileno,
			int icubed, int normalbed, String treatmenttype, String gov_or_private, float fees,
			String labavailable_or_not, String email) {
		super();
		this.hospid = hospid;
		this.hospname = hospname;
		this.hospadd = hospadd;
		this.city = city;
		this.availabletime = availabletime;
		this.mobileno = mobileno;
		this.icubed = icubed;
		this.normalbed = normalbed;
		this.treatmenttype = treatmenttype;
		this.gov_or_private = gov_or_private;
		this.fees = fees;
		this.labavailable_or_not = labavailable_or_not;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Hospital [hospid=" + hospid + ", hospname=" + hospname + ", hospadd=" + hospadd + ", city=" + city
				+ ", availabletime=" + availabletime + ", mobileno=" + mobileno + ", icubed=" + icubed + ", normalbed="
				+ normalbed + ", treatmenttype=" + treatmenttype + ", gov_or_private=" + gov_or_private + ", fees="
				+ fees + ", labavailable_or_not=" + labavailable_or_not + ", email=" + email + "]";
	}
	
	public Hospital() 
	{
		
	}
	
}