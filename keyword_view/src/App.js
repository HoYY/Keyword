import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props){
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event){
    this.setState({value: event.target.value});
  }

  handleSubmit(event){
  }

  render() {
    return (
      <div className="App">
        <form action="/test" method="post" onSubmit={this.handleSubmit}>
          <input type="text" id="test" name="test" value={this.state.value} onChange={this.handleChange}></input>
          <input type="submit" value="submit"></input>
        </form>           
      </div>
    );
  }
}

export default App;

