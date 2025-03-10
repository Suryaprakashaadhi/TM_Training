import React from "react";
import ReactDOM from "react-dom/client";

function CheckGovtOffer(props) {
  const { hasAadhar, hasPAN } = props;

  if (hasAadhar || hasPAN) {
    return (
      <h2>
        User is eligible for the government offer! Cards Available:{" "}
        {hasAadhar ? "Aadhar " : ""} {hasPAN ? "PAN" : ""}
      </h2>
    );
  } else {
    return <h2> User is NOT eligible for the government offer.</h2>;
  }
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckGovtOffer hasAadhar={false} hasPAN={true} />);

