import React from "react";
import ReactDOM from "react-dom/client";

function StudentList() {
  const students = [
    { id: 1, name: "Alice", department: "Computer Science" },
    { id: 2, name: "Bob", department: "Mechanical Engineering" },
    { id: 3, name: "Charlie", department: "Electronics" }
  ];

  return (
    <div>
      <h2>Student List with Departments</h2>
      <ul>
        {students.map((student) => (
          <li key={student.id}>
            {student.name} - {student.department}
          </li>
        ))}
      </ul>
    </div>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<StudentList />);

