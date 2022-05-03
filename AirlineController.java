package com.example.flight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.model.Airline;
import com.example.flight.service.AirlineService;

@RestController
@RequestMapping("/airlines")

public class AirlineController {

	@Autowired
	AirlineService service;
	
	@GetMapping("/all")
	public List<Airline> showAll()
	{
		return service.displayAllAirlines();
	}
	@PostMapping("/add")
	public String addFlight(@RequestBody Airline a)
	{
		return service.insert(a);
	}
	@GetMapping("/fromto/{from}/{to}")
	public List<Airline> fromTo(@PathVariable("from") String from, @PathVariable("to")
	 String to){
		return service.AirlinesFromTO(from, to);
	}
}

