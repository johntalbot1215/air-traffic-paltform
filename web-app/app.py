from flask import Flask
from flask import render_template
from flask import make_response
from flask import request
import requests


app = Flask(__name__)

app.config.from_object('config.Config')
TRAFFIC_CONTROL_BASE_URL = app.config['TRAFFIC_CONTROL_CENTER_HOST'] + ':' + str( app.config['TRAFFIC_CONTROL_CENTER_PORT'] )
TRAFFIC_CONTROL_CREATE_FLIGHT_URL = TRAFFIC_CONTROL_BASE_URL + "/create-flight"

@app.route('/')
def serve_index():
    return render_template('index.html')

@app.route('/create-flight', methods=["POST"])
def create_flight():
    print("create flight")
    flightRequest = {'flightName': request.form['flightName']}
    control_center_response = requests.post(TRAFFIC_CONTROL_CREATE_FLIGHT_URL, json = flightRequest ) 

    if( control_center_response.status_code == 200 ):
        return make_response("Flight created successfully", 200)
    else:
        return make_response("There was an error creating flight with traffic-control-center ", 500)


@app.route('/create-flight')
def create_airport():
    print("create airport")
    print(request.form)
    return make_response("ok", 200)