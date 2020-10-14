import React from 'react';
import './App.css';
import FlightCreationForm from './Components/FlightCreationForm'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <p>
          Air Traffic Dashboard
        </p>
      </header>
      <body>
        <FlightCreationForm/>
      </body>
    </div>
  );
}

export default App;
