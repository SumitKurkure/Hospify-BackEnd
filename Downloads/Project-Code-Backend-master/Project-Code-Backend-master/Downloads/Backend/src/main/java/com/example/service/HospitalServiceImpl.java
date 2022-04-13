package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HospitalDao;
import com.example.pojo.Hospital;


@Service
public class HospitalServiceImpl implements HospitalService
{
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public List<Hospital> getAllHospital() 
	{
		return hospitalDao.findAll();
	}
	
}
