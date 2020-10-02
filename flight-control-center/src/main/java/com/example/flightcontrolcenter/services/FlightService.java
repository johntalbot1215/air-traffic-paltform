package com.example.flightcontrolcenter.services;

import com.example.flightcontrolcenter.simulators.FlightSimulator;

import org.springframework.stereotype.Component;

@Component
public class FlightService {
	public void recordAndInitializeFlight(){
        Thread t = new Thread(new FlightSimulator());
        t.start();
	}
}