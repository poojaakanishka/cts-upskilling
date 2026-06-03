/*
12. AJAX & Fetch API
Scenario: Send user registration to the server.
Objective: Simulate backend communication.
Task:
• Use fetch() to POST user data to a mock API
• Show success/failure message after submission
• Use setTimeout() to simulate a delayed response
*/

const userData = {
    name: "Kani",
    email: "kani@example.com",
    event: "Music Night"
};

setTimeout(() => {

    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(userData)
    })
    .then(response => response.json())
    .then(data => {
        console.log("Registration Successful!");
        console.log(data);
    })
    .catch(error => {
        console.log("Registration Failed!");
        console.error(error);
    });

}, 2000); 