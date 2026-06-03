/*
11. Working with Forms
Scenario: Create a registration form for event sign-up.
Objective: Connect form inputs to JavaScript.
Task:
• Capture name, email, and selected event using form.elements
• Prevent default form behavior using event.preventDefault()
• Validate inputs and show errors inline
*/

document.getElementById("registrationForm").addEventListener("submit", function (event) {

    event.preventDefault();
    const form = event.target;

    const name = form.elements["name"].value.trim();
    const email = form.elements["email"].value.trim();
    const selectedEvent = form.elements["event"].value;

    const errorBox = document.getElementById("errorMessage");
    errorBox.innerHTML = "";

    let errors = [];

    if (name === "") {
        errors.push("Name is required.");
    }

    if (email === "") {
        errors.push("Email is required.");
    }

    if (selectedEvent === "") {
        errors.push("Please select an event.");
    }

    if (errors.length > 0) {
        errorBox.innerHTML = errors.join("<br>");
    } else {
        errorBox.innerHTML = "Registration Successful!";
        console.log(`Name: ${name}`);
        console.log(`Email: ${email}`);
        console.log(`Event: ${selectedEvent}`);
    }
});