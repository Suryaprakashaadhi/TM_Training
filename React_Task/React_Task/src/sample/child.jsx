import React from "react";

const ChildComponent = ({ users }) => {
  return (
    <div>
      <h3>Users List (Fetched from API)</h3>
      <ul className="list-group">
        {users.length > 0 ? (
          users.map((user) => (
            <li key={user.id} className="list-group-item">
              {user.name} - {user.email}
            </li>
          ))
        ) : (
          <p>Loading...</p>
        )}
      </ul>
    </div>
  );
};

export default ChildComponent;