package com.example.service;

import java.util.List;

import com.example.pojo.Patient;

public interface PatientService 
{
	public List<Patient> findByUsernameAndPassword(Patient patient);
	public Patient registerPatient(Patient patient);
	public Patient getPatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public Patient deletePatient(Patient patient);
}
