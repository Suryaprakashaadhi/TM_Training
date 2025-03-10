import React, { useState, useEffect } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import ChildComponent from "./sample/child";

const App = () => {
  const [users, setUsers] = useState([]);
  const [formData, setFormData] = useState({
    name: "",
    email: "",
  });

  // Fetch Data from API
  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/users")
      .then(response => {
        setUsers(response.data);
      })
      .catch(error => {
        console.error("Error fetching users:", error);
      });
  }, []);

  // Handle Form Input Change
  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  // Handle Form Submission
  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Submitted Name: ${formData.name}, Email: ${formData.email}`);
    setFormData({ name: "", email: "" });
  };

  return (
    <div className="container mt-4">
      <h2 className="text-center">React College Project</h2>
      
      {/* Form */}
      <form onSubmit={handleSubmit} className="mb-4">
        <div className="mb-3">
          <label className="form-label">Name:</label>
          <input 
            type="text" 
            name="name" 
            className="form-control"
            value={formData.name} 
            onChange={handleChange} 
            required 
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Email:</label>
          <input 
            type="email" 
            name="email" 
            className="form-control"
            value={formData.email} 
            onChange={handleChange} 
            required 
          />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>

      {/* Passing Data to Child Component */}
      <ChildComponent users={users} />
    </div>
  );
};

export default App;