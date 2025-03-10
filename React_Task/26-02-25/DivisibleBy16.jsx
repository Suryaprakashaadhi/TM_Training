import React from "react";
import ReactDOM from "react-dom/client";

function CheckDivisibility(props) {
  const number = props.num;

  if (number % 16 === 0) {
    return <h2>{number} is divisible by 16 </h2>;
  } else {
    return <h2>{number} is NOT divisible by 16 </h2>;
  }
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckDivisibility num={64} />);

