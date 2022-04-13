package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AppointmentDao;
import com.example.pojo.Appointment;



@Service
public class AppointmentServiceImpl implements AppointmentService
{
	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public Appointment registerAppointment(Appointment appointment) {
	return appointmentDao.save(appointment);
	}

	@Override
	public List<Appointment> getAppointment( ) {
	return appointmentDao.findAll();
	}	
}
