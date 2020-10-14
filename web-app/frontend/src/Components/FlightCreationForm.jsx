import React from 'react';
//import './FlightCreator.css';

const FlightCreationForm = () => {
    const submitFlight = (event) => {
        event.preventDefault();
        const data = new FormData(event.target);
        const payload = {
            'flightName': data.get('flightName'),
            'startingLatitude': data.get('startingLatitude'),
            'startingLongitude': data.get('startingLongitude'),
            'endingLatitude': data.get('endingLatitude'),
            'endingLongitude': data.get('endingLongitude')
        }
        fetch('/create-flight',{
            method: 'POST',
            body: JSON.stringify(payload),
            headers: {
                'Content-type': 'application/json'
            }
        })
    } 
    return (
        <div>
            <form onSubmit={submitFlight} >
                    <label for="flightName">Flight Name</label>
                    <input type="text" id="flightName" name="flightName"/>
                <br/>
                <br/>
                    <label for="startingLatitude"> Starting Latitude </label>
                    <input type="text" id="startingLatitude" name="startingLatitude"/>
                <br/>
                    <label for="startingLongitude"> Starting Longitude</label>
                    <input type="text" id="startingLongitude" name="startingLongitude"/>
                <br/>
                <br/>
                    <label for="endingLatitude"> Ending Latitude </label>
                    <input type="text" id="endingLatitude" name="endingLatitude"/>
                <br/>
                    <label for="endingLongitude"> Ending Longitude</label>
                    <input type="text" id="endingLongitude" name="endingLongitude"/>
                <br/>
                <input type="submit" value="Submit"/>
            </form>
        </div>
    )
}

export default FlightCreationForm;