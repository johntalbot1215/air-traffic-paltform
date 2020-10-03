package com.example.flightcontrolcenter.simulators;

import com.example.flightcontrolcenter.models.Flight;

public class FlightSimulator implements Runnable {
    public void run() {
        Flight flight = new Flight("Test", new Double[]{0.0,0.0}, new Double[]{5.0,10.0});
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