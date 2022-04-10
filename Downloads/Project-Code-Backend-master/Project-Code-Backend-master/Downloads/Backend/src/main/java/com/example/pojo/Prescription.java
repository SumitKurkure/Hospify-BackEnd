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
	@Column(name ="presid")
	int prescriptionId;
	
	@Column(name ="did")
	int did;
	
	@Column(name ="pid")
	int pid;
	
	@Column(name ="dose_per_day")
	int dose_per_day;
	
	@Column(name ="daystovisit")
	int visit_after_days;
	

	@Column(name ="labtestname")
	String labTestName;
	
	@Column(name="patientusername")
	String patientUsername;
	
	@Column(name = "medicinefirst")
	String medicineFirst;

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getMedicineFirst() {
		return medicineFirst;
	}

	public void setMedicineFirst(String medicineFirst) {
		this.medicineFirst = medicineFirst;
	}

	public String getMedicineSecond() {
		return medicineSecond;
	}

	public void setMedicineSecond(String medicineSecond) {
		this.medicineSecond = medicineSecond;
	}

	@Column(name = "medicinesecond")
	String medicineSecond;

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

	public Prescription(int prescriptionId, int did, int pid, int dose_per_day, int visit_after_days,
			String labTestName, String patientUsername, String medicineFirst, String medicineSecond) {
		super();
		this.prescriptionId = prescriptionId;
		this.did = did;
		this.pid = pid;
		this.dose_per_day = dose_per_day;
		this.visit_after_days = visit_after_days;
		this.labTestName = labTestName;
		this.patientUsername = patientUsername;
		this.medicineFirst = medicineFirst;
		this.medicineSecond = medicineSecond;
	}
	
	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", did=" + did + ", pid=" + pid + ", dose_per_day="
				+ dose_per_day + ", visit_after_days=" + visit_after_days + ", labTestName=" + labTestName
				+ ", patientUsername=" + patientUsername + ", medicineFirst=" + medicineFirst + ", medicineSecond="
				+ medicineSecond + "]";
	}

	public Prescription()
	{
		
	}
}
