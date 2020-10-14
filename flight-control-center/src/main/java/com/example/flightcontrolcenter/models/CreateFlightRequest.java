package com.example.flightcontrolcenter.models;

import lombok.Data;

@Data
public class CreateFlightRequest {
    private String flightName;
    private Double startingLongitude;
    private Double startingLatitude;
    private Double endingLongitude;
    private Double endingLatitude;
}
