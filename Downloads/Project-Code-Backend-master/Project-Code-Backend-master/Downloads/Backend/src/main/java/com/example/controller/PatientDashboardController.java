package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AppointmentDao;
import com.example.pojo.Appointment;
import com.example.pojo.Prescription;
import com.example.service.AppointmentServiceImpl;
import com.example.service.DoctorServiceImpl;
import com.example.service.HospitalServiceImpl;
import com.example.service.PatientServiceImpl;
import com.example.service.PrescriptionServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/dashboard")
public class PatientDashboardController 
{
	@Autowired
	private AppointmentServiceImpl appointmentService;
	
	@Autowired
	private PatientServiceImpl patientService;
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Autowired
	private HospitalServiceImpl hospService;
	
	@Autowired
	private PrescriptionServiceImpl prescriptionServiceImpl;
	
	@Autowired
	private AppointmentDao apptDao;
	
	@GetMapping("/appointment/{username}")
	public List<Appointment> getAppointmentDetails(@PathVariable String username)
	{
		System.out.println("in appt ");
		return apptDao.getAppointmentDetailsByUsername(username);
	}
	
	@GetMapping("/prescription/{username}")
	public List<Prescription> getPrescription(@PathVariable String username)
	{
		System.out.println("in prep");
		
		List<Prescription> presList =  prescriptionServiceImpl.getPrescription(username);
		
		return presList;
	}
}

