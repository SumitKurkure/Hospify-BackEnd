package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@Column(name = "appointmentid")
	int appointmentId;
	
	@Column(name = "hospid")
	int hospId;
	
	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getHospId() {
		return hospId;
	}

	public void setHospId(int hospId) {
		this.hospId = hospId;
	}

	@Column(name ="DID")
	int did;
	
	@Column(name ="pid")
	int pid;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="dname")
	String dname;
	
	@Column(name="fees")
	float fees;
	
	@Column(name="appointmentdate")
	String appointmentDate;
	
	@Column(name = "appointmenttype")
	String appointmentType;
	
	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	

	
	
	public Appointment(int appointmentId, int hospId, int did, int pid, String pname, String dname, float fees,
			String appointmentDate, String appointmentType) {
		super();
		this.appointmentId = appointmentId;
		this.hospId = hospId;
		this.did = did;
		this.pid = pid;
		this.pname = pname;
		this.dname = dname;
		this.fees = fees;
		this.appointmentDate = appointmentDate;
		this.appointmentType = appointmentType;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", hospId=" + hospId + ", did=" + did + ", pid=" + pid
				+ ", pname=" + pname + ", dname=" + dname + ", fees=" + fees + ", appointmentDate=" + appointmentDate
				+ ", appointmentType=" + appointmentType + "]";
	}

	public Appointment()
	{
		
	}
}
