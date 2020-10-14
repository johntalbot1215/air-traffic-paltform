package com.example.flightcontrolcenter.controllers;

import com.example.flightcontrolcenter.models.CreateFlightRequest;
import com.example.flightcontrolcenter.models.Flight;
import com.example.flightcontrolcenter.services.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	@Autowired
	FlightService flightService;

	@PostMapping("/create-flight")
	public String createFlight(@RequestBody CreateFlightRequest flightRequest ) {
		System.out.println("Got create flight request " + flightRequest.getFlightName());
		String flightName = flightRequest.getFlightName();
		Double[] departureLatLon =  { flightRequest.getStartingLatitude(), flightRequest.getStartingLongitude() };
		Double[] arrivalLatLon =  { flightRequest.getEndingLatitude(), flightRequest.getEndingLongitude() };
		Flight newFlight = new Flight(flightName, departureLatLon, arrivalLatLon );
		flightService.recordAndInitializeFlight(newFlight);
		return new String("Flight created");
	}
}