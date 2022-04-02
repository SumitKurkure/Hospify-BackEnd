package com.example.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightbooking.model.FlightbookingDTO;
import com.example.flightbooking.repository.FlightbookingRepository;


@RestController
@RequestMapping("/arlines-PRN")
public class FlightbookingController 
{
	@Autowired
	private FlightbookingRepository bookingRepo;
	
	@GetMapping("/all")
	public List<FlightbookingDTO> getAllBooking()
	{
		System.out.println(bookingRepo.findAll());
		return bookingRepo.findAll();
	}
	
	@GetMapping("/ticket/{ticketid}")
	public FlightbookingDTO getByID(@PathVariable int ticketid)
	{
		System.out.println("in ticket id controller");
		  return bookingRepo.getById(ticketid);
	}
	
	@PostMapping("/book")
	public String addBooking(@RequestBody FlightbookingDTO objbook )
	{
		System.out.println("in ticket id book ticket");
		System.out.println(objbook);
		bookingRepo.save(objbook);
	
		return "Booking Done";
		
	}
	
}



