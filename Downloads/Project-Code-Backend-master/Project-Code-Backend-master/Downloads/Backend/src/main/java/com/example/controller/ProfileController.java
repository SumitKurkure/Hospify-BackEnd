package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PatientDao;
import com.example.pojo.Patient;
import com.example.service.PatientServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/profile")
public class ProfileController 
{
	@Autowired
	private PatientServiceImpl patientService;
	
	@GetMapping("/patient/{username}")
    public Patient getPatientDetails(@PathVariable String username, Patient patient)
	{
		System.out.println("in profile mapping");
        List<Patient> patientList = patientService.getPatientDetails();
              
        for(Patient patientObj : patientList)
        {
        	if(patientObj.getUsername().equals(username))
        	{
        		return patientObj;
        	}
        }
		return null;
    }
	
	@Autowired 
	private PatientDao patientDao;
	
	@PostMapping("/patient/update/{username}")
	public String updatePatientDetaString(@PathVariable String username, Patient patient)
	{
		System.out.println("in update profile mapping");
        List<Patient> patientList = patientService.getPatientDetails();
         
        for(Patient patientObj : patientList)
        {
        	if(patientObj.getUsername().equals(username))
        	{
        		patientObj.setAddress(patient.getAddress());
        		patientObj.setAge(patient.getAge());
        		patientObj.setName(patient.getName());
        		patientObj.setMobno(patient.getMobno());
        		patientObj.setGender(patient.getGender());
        		patientObj.setBloodgroup(patient.getBloodgroup());
        		return "update";
        	}
        }
        patientDao.save(patient);
		return null;
	}
}
