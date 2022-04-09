package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PatientDao;
import com.example.pojo.Patient;

@Service
public class PatientServiceImpl implements PatientService
{
	@Autowired
	private PatientDao patientDao;

	@Override
	public List<Patient> findByUsernameAndPassword(Patient patient)
	{
		return patientDao.findAll();
		
	}

	@Override
	public Patient registerPatient(Patient patient) {
		return patientDao.save(patient);
	}

	@Override
	public List<Patient> getPatientDetails() {
		return patientDao.findAll();
	} 
	

}
