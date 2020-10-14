package com.example.flightcontrolcenter.simulators;

import com.example.flightcontrolcenter.models.Flight;

public class FlightSimulator implements Runnable {
    private Flight flight;
    public FlightSimulator(Flight flight){
        this.flight = flight;
    }
    public void run() {
        Boolean flightActive = true;
        System.out.println("Simulating flight");
        try {
            while (flightActive) {
                System.out.println("Current location " + flight.getCurrentLocation()[0] + "," + flight.getCurrentLocation()[1] );
                flight.updateCurrentLocation();
                if( flight.hasArrived() ){
                    flightActive = false;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread had an exception");
        }
    }
}