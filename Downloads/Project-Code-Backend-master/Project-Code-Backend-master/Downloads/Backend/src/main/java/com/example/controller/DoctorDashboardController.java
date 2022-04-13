package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AppointmentDao;
import com.example.pojo.Appointment;
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
	public String sendPrescription( @PathVariable String username ,@RequestBody Prescription prescription)
	{
		System.out.println("firec send prescription");
		
		List<Doctor> doctorList = doctorService.getDoctorDetails();
		List<Patient> patientList = patientServiceImpl.getPatientDetails();
		
		
		for(Doctor doctorObj : doctorList)
		{
			
			System.out.println(doctorObj.getUsername());
			if(doctorObj.getUsername() == username)
			{
				prescription.setDid(doctorObj.getDid());
			}
		}
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(prescription.getPatientUsername()))
			{
				prescription.setPid(patientObj.getPid());
			}
		}
		
		prescriptionServiceImpl.setPrescription(prescription);
		
		return "sended";
	}
	
	@PostMapping("/setavailabletime/{username}")
	public String setAvailableTime( @PathVariable String username ,@RequestBody Doctor doctor)
	{
		System.out.println("in set time doctor");
		List<Doctor> doctorList = doctorService.getDoctorDetails();
		
		System.out.println(doctor.getAvailableTime());
		for(Doctor doctorObj : doctorList)
		{
			if(doctorObj.getUsername().equals(username))
			{
				doctorObj.setAvailableTime(doctor.getAvailableTime());
				doctorService.setAvtTime(doctorObj);
			}	return "updated";
		}
		
		return null;
	}
	
	@Autowired
	private AppointmentDao apptDao;
	
	@GetMapping("/doctor/appointment/{username}")
	public List<Appointment> getAppointmentDetails(@PathVariable String username)
	{
		System.out.println("in appt doctor ");
		return apptDao.getAppointmentByDetailsUsernameDoctor(username);
	}
}
