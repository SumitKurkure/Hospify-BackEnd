package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.DoctorDao;
import com.example.dao.PatientDao;
import com.example.pojo.Doctor;
import com.example.pojo.Patient;
import com.example.service.DoctorServiceImpl;
import com.example.service.PatientServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/register")
public class RegisterController
{
	@Autowired
	private PatientServiceImpl patientService;
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Autowired
	private PatientDao patientDao;
	
	@Autowired
	private DoctorDao doctorDao;
	
	
	@PostMapping("/patient")
	public String registerPatient(@RequestBody Patient patient)
	{
		patientService.registerPatient(patient);
		BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder();
		String pass = encoder.encode(patient.getPassword());
		patient.setPassword(pass);
		patientDao.save(patient);
		return "success";
		
	}
	
	@PostMapping("/doctor")
	public String registerDoctor(@RequestBody Doctor doctor)
	{
		doctorService.registerDoctor(doctor);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String pass = encoder.encode(doctor.getPassword());
		doctor.setPassword(pass);
		doctorDao.save(doctor);
		return "success";
	}
}
