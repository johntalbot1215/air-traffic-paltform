package com.example.flightcontrolcenter.services;

import com.example.flightcontrolcenter.models.Flight;
import com.example.flightcontrolcenter.simulators.FlightSimulator;

import org.springframework.stereotype.Component;

@Component
public class FlightService {
	public void recordAndInitializeFlight(Flight newFlight){
        Thread t = new Thread(new FlightSimulator(newFlight));
        t.start();
	}
}