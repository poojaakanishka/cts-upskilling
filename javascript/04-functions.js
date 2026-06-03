/*
4. Functions, Scope, Closures, Higher-Order Functions
Scenario: Create reusable functions for event operations.
Objective: Encapsulate logic and use closures.
Task:
• Create addEvent(), registerUser(), filterEventsByCategory()
• Use closure to track total registrations for a category
• Pass callbacks to filter functions for dynamic search
*/
let events = [];

function addEvent(name, category, seats) {
    events.push({ name, category, seats });
}

function registerUser(eventName) {
    const event = events.find(e => e.name === eventName);

    if (event && event.seats > 0) {
        event.seats--;
        console.log(`Registered for ${event.name}. Remaining seats: ${event.seats}`);
    } else {
        console.log(`Registration failed for ${eventName}.`);
    }
}

function registrationTracker(category) {
    let totalRegistrations = 0;

    return function () {
        totalRegistrations++;
        console.log(`${category} Registrations: ${totalRegistrations}`);
    };
}

function filterEventsByCategory(category, callback) {
    const filteredEvents = events.filter(event => event.category === category);
    callback(filteredEvents);
}

addEvent("Music Night", "Music", 5);
addEvent("Tech Talk", "Technology", 10);
addEvent("Rock Concert", "Music", 8);

registerUser("Music Night");
registerUser("Music Night");

const musicTracker = registrationTracker("Music");
musicTracker();
musicTracker();

filterEventsByCategory("Music", function(filteredEvents) {
    console.log("Filtered Events:");
    filteredEvents.forEach(event => {
        console.log(`${event.name} - ${event.category}`);
    });
});