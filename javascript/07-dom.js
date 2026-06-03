/*
7. DOM Manipulation
Scenario: Display all events dynamically on the webpage.
Objective: Render events using JS.
Task:
• Access DOM elements using querySelector()
• Create and append event cards using createElement()
• Update UI when user registers or cancels
*/

const container = document.querySelector("#eventContainer");

const events = [
    { name: "Music Night", seats: 5 },
    { name: "Workshop on Baking", seats: 3 },
    { name: "Tech Talk", seats: 2 }
];

function displayEvents() {
    container.innerHTML = "";

    events.forEach((event, index) => {

        const card = document.createElement("div");

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Available Seats: <span id="seats-${index}">${event.seats}</span></p>
            <button onclick="register(${index})">Register</button>
            <button onclick="cancel(${index})">Cancel</button>
            <hr>
        `;

        container.appendChild(card);
    });
}

function register(index) {
    if (events[index].seats > 0) {
        events[index].seats--;
        displayEvents(); 
    } else {
        alert("No seats available!");
    }
}

function cancel(index) {
    events[index].seats++;
    displayEvents(); 
}

displayEvents();