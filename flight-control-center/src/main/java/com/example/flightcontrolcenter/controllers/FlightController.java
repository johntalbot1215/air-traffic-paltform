package com.example.flightcontrolcenter.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.example.flightcontrolcenter.services.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	@Autowired
	FlightService flightService;

	@GetMapping("/create-flight")
	public String createFlight() {
		System.out.println("Got create flight request");
		flightService.recordAndInitializeFlight();
		return new String("Flight created");
	}
}