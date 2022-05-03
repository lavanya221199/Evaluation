package com.example.passenger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.passenger.model.Passengers;
import com.example.passenger.repo.PassengerRepo;

@Service
public class PassengerService {

	
	@Autowired
	PassengerRepo repo;
	public String insertPassenger(Passengers p)
	{
		repo.save(p);
		return "Passener Added";
	}
	public List<Passengers> displayAllPassenger(){
		return repo.findAll();
	}
	public String delPassenger(int id) {
		repo.deleteById(id);
		return "Passenger Deleted";
	}
}
