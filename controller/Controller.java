package com.example.passenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.passenger.model.Passengers;
import com.example.passenger.service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class Controller {
	
	@Autowired
	PassengerService service;
	
	@GetMapping("/all")
	
	public List<Passengers> displayPassengers()
	{
		return service.displayAllPassenger();
		
	}
	@GetMapping("/deletePassenger/{id}")
	
	public String deletePassenger(@PathVariable("id") int id)
	{
		return service.delPassenger(id);
	}

	@PostMapping("/add")
	public String insertPassenger(@RequestBody Passengers p) {
		return service.insertPassenger(p);
	}
}
