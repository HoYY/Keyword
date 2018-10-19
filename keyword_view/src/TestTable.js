import React, { Component } from 'react';

class TestTable extends Component {
  render() {
    return (
      <div>
        <React.Fragment>
          <td>{this.props.data.rest}</td>
        </React.Fragment>
      </div>
    );
  }
}

TestTable.defaultProps = {
  data: null
};

export default TestTable;