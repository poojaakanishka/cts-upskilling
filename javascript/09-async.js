/*
9. Async JS, Promises, Async/Await
Scenario: Fetch event data from a mock API.
Objective: Use asynchronous logic for remote operations.
Task:
• Fetch events from a mock JSON endpoint
• Use .then() and .catch() to handle results
• Rewrite using async/await and show loading spinner
*/

const apiURL = "https://jsonplaceholder.typicode.com/posts";

// Loading spinner
function showLoading() {
    console.log("Loading events...");
}

function hideLoading() {
    console.log("Events loaded.");
}

function fetchEventsWithPromises() {
    showLoading();

    fetch(apiURL)
        .then(response => response.json())
        .then(data => {
            console.log("Events (Promise):");
            console.log(data.slice(0, 5)); // Display first 5 records
            hideLoading();
        })
        .catch(error => {
            console.log("Error:", error);
            hideLoading();
        });
}

async function fetchEventsAsync() {
    try {
        showLoading();

        const response = await fetch(apiURL);
        const data = await response.json();

        console.log("Events (Async/Await):");
        console.log(data.slice(0, 5)); // Display first 5 records

        hideLoading();
    } catch (error) {
        console.log("Error:", error);
        hideLoading();
    }
}

fetchEventsWithPromises();
fetchEventsAsync();