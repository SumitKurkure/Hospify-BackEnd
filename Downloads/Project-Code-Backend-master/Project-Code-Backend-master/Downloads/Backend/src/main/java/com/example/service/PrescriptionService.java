package com.example.service;

import java.util.List;

import com.example.pojo.Prescription;

public interface PrescriptionService {
		public Prescription setPrescription(Prescription prescription);

		List<Prescription> getPrescription(String username);

	
}
