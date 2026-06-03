/*
13. Debugging and Testing
Scenario: Registration is failing silently. You need to debug.
Objective: Use browser tools to inspect and fix issues.
Task:
• Use Chrome Dev Tools Console and Network tab
• Add breakpoints and inspect variables
• Log form submission steps and check fetch request payload
*/

function submitRegistration() {

    console.log("Step 1: Registration started");

    const userData = {
        name: "Kani",
        email: "kani@example.com",
        event: "Music Night"
    };

    console.log("Step 2: User Data =", userData);

    debugger;

    console.log("Step 3: Sending data to server...");

    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(userData)
    })
    .then(response => {
        console.log("Step 4: Response Status =", response.status);
        return response.json();
    })
    .then(data => {
        console.log("Step 5: Registration Successful");
        console.log("Response Data:", data);
    })
    .catch(error => {
        console.error("Step 6: Registration Failed");
        console.error(error);
    });
}

submitRegistration();