from flask import Flask
from flask import render_template
from flask import make_response
from flask import request


app = Flask(__name__)

@app.route('/')
def serve_index():
    return render_template('index.html')

@app.route('/create-flight', methods=["POST"])
def create_flight():
    print("create flight")
    print(request.form)
    return make_response("ok", 200)

@app.route('/create-flight')
def create_airport():
    print("create airport")
    print(request.form)
    return make_response("ok", 200)