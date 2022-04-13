package com.example.service;

import java.util.List;

import com.example.pojo.Appointment;



public interface AppointmentService {
	public Appointment registerAppointment(Appointment appointment);
	
	public List<Appointment> getAppointment();
}
