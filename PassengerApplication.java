package com.example.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@ComponentScan(basePackages= "com.example.passenger")
@SpringBootApplication
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
