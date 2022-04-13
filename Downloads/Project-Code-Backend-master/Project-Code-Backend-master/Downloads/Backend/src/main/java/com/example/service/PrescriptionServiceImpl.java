package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PrescriptionDao;
import com.example.pojo.Prescription;


@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionDao prescriptionDao;

	@Override
	public List<Prescription> getPrescription(String username)
	{
		return prescriptionDao.getPrescriptionDetailsByUsername(username);
	}

	@Override
	public Prescription setPrescription(Prescription prescription) {
		return prescriptionDao.save(prescription);
	}


	
}
