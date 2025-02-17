function displayMultiplicationTable() {
    let number = 5; // Default number
    let limit = 10; // Default limit

    console.log(`Multiplication Table for ${number} up to ${limit}:`);
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }
}

function displayFactors(num) {
    console.log(`Factors of ${num}:`);
    for (let i = 1; i <= num; i++) {
        if (num % i === 0) {
            console.log(i);
        }
    }
}

function checkSumEvenOrOdd(num) {
    let sum = num.toString().split('').reduce((acc, digit) => acc + parseInt(digit), 0);
    console.log(`Sum of digits of ${num} is ${sum}, which is ${sum % 2 === 0 ? 'even' : 'odd'}.`);
}

const chooseOperation = () => {
    let operation = "add"; // Change this value to test different operations
    let a = 10, b = 5;
    
    switch (operation) {
        case "add":
            console.log(`Sum: ${a + b}`);
            break;
        case "subtract":
            console.log(`Difference: ${a - b}`);
            break;
        case "multiply":
            console.log(`Product: ${a * b}`);
            break;
        case "divide":
            console.log(`Quotient: ${Math.floor(a / b)}, Remainder: ${a % b}`);
            break;
        default:
            console.log("Invalid operation");
    }
};

const student = {
    id: 101,
    name: "John Doe",
    department: "Computer Science",
    college: "XYZ University",
    email: "john.doe@example.com",
    address: {
        doorNo: "12A",
        street: "Main Street",
        area: "Downtown",
        pincode: "123456"
    }
};

function displayStudentDetails() {
    console.log(`ID: ${student.id}, Name: ${student.name}, Department: ${student.department}, College: ${student.college}, Email: ${student.email}`);
}

displayStudentDetails();

delete student.email;

displayStudentDetails = function() {
    console.log(`ID: ${student.id}, Name: ${student.name}, Department: ${student.department}, College: ${student.college}`);
    console.log(`Address: Door No: ${student.address.doorNo}, Street: ${student.address.street}, Area: ${student.address.area}, Pincode: ${student.address.pincode}`);
};

displayStudentDetails();

// Call the functions
displayMultiplicationTable();
displayFactors(12);
checkSumEvenOrOdd(123);
chooseOperation();
