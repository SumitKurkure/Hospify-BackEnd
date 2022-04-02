package com.example.flightbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="flightbooking")
public class FlightbookingDTO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticketid")
	int ticketid;
	
	@Column(name="cityfrom")
	String cityform;
	
	@Column(name="cityto")
	String cityTo;	
	
	@Column(name="traveldate")
	String traveldate;
	
	public FlightbookingDTO(int ticketid,  String cityform, String cityTo, String traveldate) {
		super();
		this.ticketid = ticketid;
	
		this.cityform = cityform;
		this.cityTo = cityTo;
		this.traveldate = traveldate;
	}
	
	public FlightbookingDTO() {
		
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}


	public String getCityform() {
		return cityform;
	}

	public void setCityform(String cityform) {
		this.cityform = cityform;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public String getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}

	
	
}


