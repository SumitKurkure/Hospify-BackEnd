package com.example.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightbooking.model.FlightbookingDTO;

public interface FlightbookingRepository extends JpaRepository<FlightbookingDTO, Integer> 
{
	
}
