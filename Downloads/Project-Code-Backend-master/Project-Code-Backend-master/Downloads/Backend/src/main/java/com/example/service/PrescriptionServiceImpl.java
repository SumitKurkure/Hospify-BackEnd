package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.PrescriptionDao;
import com.example.pojo.Prescription;



public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionDao prescriptionDao;

	@Override
	public List<Prescription> getPrescription(Prescription prescription) {
		return prescriptionDao.findAll();
	}

	@Override
	public Prescription setPrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionDao.save(prescription);
	}


	
}
