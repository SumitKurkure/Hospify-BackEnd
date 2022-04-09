package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Doctor;
import com.example.pojo.Patient;
import com.example.pojo.Prescription;
import com.example.service.DoctorServiceImpl;
import com.example.service.PatientServiceImpl;
import com.example.service.PrescriptionServiceImpl;

@CrossOrigin("*")
@RequestMapping("/dashboard")
@RestController
public class DoctorDashboardController 
{
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Autowired
	private PatientServiceImpl patientServiceImpl;
	
	@Autowired
	private PrescriptionServiceImpl prescriptionServiceImpl;
	
	@PostMapping("/doctor/sendprescription/{username}")
	public String sendPrescription( @PathVariable String username ,Prescription prescription)
	{
		List<Doctor> doctorList = doctorService.getDoctorDetails();
		List<Patient> patientList = patientServiceImpl.getPatientDetails();
		
		String doctorUsername = username;
		String patientUsername = prescription.getPatientUsername();
		
		
		for(Doctor doctorObj : doctorList)
		{
			if(doctorObj.getUsername().equals(doctorUsername))
			{
				prescription.setDid(doctorObj.getDid());
			}
		}
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(patientUsername))
			{
				prescription.setPid(patientObj.getPid());
				prescription.setPatientUsername(patientUsername);
			}
		}
		
		prescriptionServiceImpl.setPrescription(prescription);
		
		return "sended";
	}
}
