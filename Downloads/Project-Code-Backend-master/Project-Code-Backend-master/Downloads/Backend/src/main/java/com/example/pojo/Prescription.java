package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescription")
public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="DID")
	int did;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="pid")
	int pid;
	
	@Column(name ="medicalname")
	String medicalName;
	
	@Column(name ="dose_per_day")
	int dose_per_day;
	
	@Column(name ="days")
	int visit_after_days;
	

	@Column(name ="labtestname")
	String labTestName;
	
	@Column(name="patientusername")
	String patientUsername;

	public String getPatientUsername() {
		return patientUsername;
	}

	public void setPatientUsername(String patientUsername) {
		this.patientUsername = patientUsername;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public int getVisit_after_days() {
		return visit_after_days;
	}

	public void setVisit_after_days(int visit_after_days) {
		this.visit_after_days = visit_after_days;
	}
	
	public String getMedicalName() {
		return medicalName;
	}

	public void setMedicalName(String medicalName) {
		this.medicalName = medicalName;
	}

	public int getDose_per_day() {
		return dose_per_day;
	}

	public void setDose_per_day(int dose_per_day) {
		this.dose_per_day = dose_per_day;
	}

	
	public String getLabTestName() {
		return labTestName;
	}

	public void setLabTestName(String labTestName) {
		this.labTestName = labTestName;
	}

	public Prescription(int did, int pid, String medicalName, int dose_per_day, int visit_after_days, String labTestName,
			String patientUsername) {
		super();
		this.did = did;
		this.pid = pid;
		this.medicalName = medicalName;
		this.dose_per_day = dose_per_day;
		this.visit_after_days = visit_after_days;
		this.labTestName = labTestName;
		this.patientUsername = patientUsername;
	}

	@Override
	public String toString() {
		return "Prescription [did=" + did + ", pid=" + pid + ", medicalName=" + medicalName + ", dose_per_day="
				+ dose_per_day + ", visit_after_days=" + visit_after_days + ", labTestName=" + labTestName + ", patientUsername="
				+ patientUsername + "]";
	}

	public Prescription()
	{
		
	}
}
