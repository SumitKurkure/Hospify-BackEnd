package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PatientDao;
import com.example.pojo.Doctor;
import com.example.pojo.Patient;
import com.example.service.DoctorServiceImpl;
import com.example.service.PatientServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController
{

	@Autowired
	private PatientServiceImpl patientService;
	
	
//	@PostMapping("/patient")
//	public String loginAuthentication(@RequestBody Patient patient)
//	{ 
//		System.out.println("Fired patient login controller");
//		
//		List<Patient> patientList = patientService.findByUsernameAndPassword(patient);
//		
////		BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder();
////		String pass = encoder.encode(patient.getPassword());
//		
//		for(Patient patientObj : patientList)
//		{
//			
//			if(patientObj.getUsername().equals(patient.getUsername()) && patientObj.getPassword().equals(patient.getPassword()));
//			{
//				return "valid";
//			}
//		}
//		return "invalid";
//	}
	
	@PostMapping("/patient")
	public String loginAuthentication(@RequestBody Patient patient)
	{ 
		System.out.println("Fired doctor login controller");
		
		List<Patient> patientList = patientService.findByUsernameAndPassword(patient);
	
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(patient.getUsername()) && patientObj.getPassword().equals(patient.getPassword()))
			{
				return "valid";
			}
		}
		return "invalid";
	}
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@PostMapping("/doctor")
	public String loginAuthentication(@RequestBody Doctor doctor)
	{ 
		System.out.println("Fired doctor login controller");
		
		List<Doctor> doctorList = doctorService.findByUsernameAndPassword(doctor);
	
		for(Doctor doctorObj : doctorList)
		{
			if(doctorObj.getUsername().equals(doctor.getUsername()) && doctorObj.getPassword().equals(doctor.getPassword()))
			{
				return "valid";
			}
		}
		return "invalid";
	}
	
	@Autowired
	private PatientDao patientDao;
	
	@PostMapping("/patient/forgotpassword/{username}")
	public String forgotPassword(@PathVariable String username,@RequestBody Patient patient)
	{
		System.out.println("in forgot password controller");

		System.out.println(patient.getUsername());
		System.out.println(patient.getPassword());
		
		List<Patient> patientList = patientService.getPatientDetails();
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(username));
			{

				patientObj.setPassword(patient.getPassword());
				
				System.out.println(patient.getPassword());
				System.out.println(patientObj.getUsername());

				patientDao.save(patientObj);
				return "changed";
			}
		}
		
		return "not chaged";
	}

	
	
}
