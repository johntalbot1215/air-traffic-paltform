package com.example.flightcontrolcenter.models;

import java.security.Timestamp;


public class Flight {
    private String name;
    private Double[] arrivalLatLon;
    private Double[] currentLatLon;
    private Boolean hasArrived;
    private Double speed;

    public Flight(String flightName, Double[] departureLatLon, Double[] arrivalLatLon ){
        this.name = flightName;
        this.currentLatLon = departureLatLon;
        this.arrivalLatLon = arrivalLatLon;
        hasArrived = false;
        speed = 1.0;
    }
    public Double[] getCurrentLocation(){
        return currentLatLon;
    }
    
    public void updateCurrentLocation(){
        if(hasArrived){
            return;
        }

       Double flightVectorX = arrivalLatLon[0] - currentLatLon[0];
       Double flightVectorY = arrivalLatLon[1] - currentLatLon[1];
       Double flightVectorLength = Math.sqrt( flightVectorX * flightVectorX + flightVectorY * flightVectorY );
       Double normalFlightVectorX = flightVectorX / flightVectorLength;
       Double normalFlightVectorY = flightVectorY / flightVectorLength;

       if(flightVectorLength < speed ){
        currentLatLon = arrivalLatLon;
        hasArrived = true;
        return;
       }

       currentLatLon[0] = currentLatLon[0] + normalFlightVectorX;
       currentLatLon[1] = currentLatLon[1] + normalFlightVectorY;

    }
    public Boolean hasArrived(){
        return hasArrived;
    }
    
}
