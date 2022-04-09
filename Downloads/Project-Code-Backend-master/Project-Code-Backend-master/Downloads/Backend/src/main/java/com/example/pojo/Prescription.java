//package com.example.pojo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "prescription")
//public class Prescription {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name ="DID")
//	int did;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name ="pid")
//	int pid;
//	
//	@Column(name ="medicalname")
//	String medicalName;
//	
//	@Column(name ="dose_per_day")
//	int dose_per_day;
//	
//	@Column(name ="days")
//	int days;
//	
//	@Column(name ="labtestname")
//	String labTestName;
//
//	public int getDid() {
//		return did;
//	}
//
//	public void setDid(int did) {
//		this.did = did;
//	}
//
//	public int getPid() {
//		return pid;
//	}
//
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//
//	public String getMedicalName() {
//		return medicalName;
//	}
//
//	public void setMedicalName(String medicalName) {
//		this.medicalName = medicalName;
//	}
//
//	public int getDose_per_day() {
//		return dose_per_day;
//	}
//
//	public void setDose_per_day(int dose_per_day) {
//		this.dose_per_day = dose_per_day;
//	}
//
//	public int getDays() {
//		return days;
//	}
//
//	public void setDays(int days) {
//		this.days = days;
//	}
//
//	public String getLabTestName() {
//		return labTestName;
//	}
//
//	public void setLabTestName(String labTestName) {
//		this.labTestName = labTestName;
//	}
//
//	public Prescription(int did, int pid, String medicalName, int dose_per_day, int days, String labTestName) {
//		super();
//		this.did = did;
//		this.pid = pid;
//		this.medicalName = medicalName;
//		this.dose_per_day = dose_per_day;
//		this.days = days;
//		this.labTestName = labTestName;
//	}
//
//	@Override
//	public String toString() {
//		return "Prescription [did=" + did + ", pid=" + pid + ", medicalName=" + medicalName + ", dose_per_day="
//				+ dose_per_day + ", days=" + days + ", labTestName=" + labTestName + "]";
//	}
//	
//	public Prescription()
//	{
//		
//	}
//}
