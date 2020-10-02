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
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(FlightControlCenterApplication.class, args);
	}

}
