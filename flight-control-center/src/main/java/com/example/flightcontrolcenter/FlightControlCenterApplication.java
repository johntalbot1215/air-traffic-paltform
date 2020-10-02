package com.example.flightcontrolcenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightControlCenterApplication {

	private static final Logger logger = LoggerFactory.getLogger(FlightControlCenterApplication.class);

	public static void main(String[] args) {
		System.out.println("Starting app");
		SpringApplication.run(FlightControlCenterApplication.class, args);
	}

}
