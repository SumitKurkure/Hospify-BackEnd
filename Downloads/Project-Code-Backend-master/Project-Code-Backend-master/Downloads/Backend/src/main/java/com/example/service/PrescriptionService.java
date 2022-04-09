package com.example.service;

import java.util.List;

import com.example.pojo.Prescription;

public interface PrescriptionService {
	
	public List<Prescription> getPrescription(Prescription prescription);
	public Prescription setPrescription(Prescription prescription);

	
}
