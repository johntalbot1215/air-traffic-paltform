package com.example.flightcontrolcenter.models;

import lombok.Data;

@Data
public class CreateFlightRequest {
    private String flightName;
    private String departureAirport;
    private String arrivalAirport;
}
