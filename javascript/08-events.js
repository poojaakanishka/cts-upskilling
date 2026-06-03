/*
8. Event Handling
Scenario: Add interactive elements like buttons and filters.
Objective: Respond to user actions.
Task:
• Use onclick for "Register" buttons
• Use onchange to filter events by category
• Use keydown to allow quick search by name
*/
const events = [
    { name: "Music Night", category: "Music" },
    { name: "Rock Concert", category: "Music" },
    { name: "Workshop on Baking", category: "Workshop" },
    { name: "Tech Talk", category: "Technology" }
];

function registerEvent(eventName) {
    alert(`Successfully registered for ${eventName}`);
}

function filterEvents() {
    const selectedCategory = document.getElementById("categoryFilter").value;

    const filteredEvents = selectedCategory === "All"
        ? events
        : events.filter(event => event.category === selectedCategory);

    displayEvents(filteredEvents);
}

function searchEvents() {
    const searchText = document.getElementById("searchBox").value.toLowerCase();

    const filteredEvents = events.filter(event =>
        event.name.toLowerCase().includes(searchText)
    );

    displayEvents(filteredEvents);
}

function displayEvents(eventList) {
    const container = document.getElementById("eventList");
    container.innerHTML = "";

    eventList.forEach(event => {
        container.innerHTML += `
            <p>
                ${event.name} (${event.category})
                <button onclick="registerEvent('${event.name}')">
                    Register
                </button>
            </p>
        `;
    });
}

displayEvents(events);