package com.example.passenger.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.passenger.model.Passengers;

@Repository
@Transactional
public interface PassengerRepo extends JpaRepository<Passengers,Integer>{

}
