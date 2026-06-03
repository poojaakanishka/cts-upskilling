/*
3. Conditionals, Loops, and Error Handling
Scenario: Only show valid events and limit registrations.
Objective: Apply conditions and handle invalid data.
User Story: As a user, I want only upcoming events with seats to be displayed.
Task:
• Use if-else to hide past or full events
• Loop through the event list and display using forEach()
• Wrap registration logic in try-catch to handle errors
*/
const events = [
    { name: "Music Fest", upcoming: true, seats: 10 },
    { name: "Tech Seminar", upcoming: false, seats: 20 },
    { name: "Art Workshop", upcoming: true, seats: 0 }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(`Event: ${event.name}, Seats Available: ${event.seats}`);
    } else {
        console.log(`Event "${event.name}" is hidden (past event or no seats available).`);
    }
});

function register(event) {
    try {
        if (!event.upcoming) {
            throw new Error("Cannot register for a past event.");
        }

        if (event.seats <= 0) {
            throw new Error("No seats available.");
        }

        event.seats--;
        console.log(`Successfully registered for ${event.name}. Remaining seats: ${event.seats}`);

    } catch (error) {
        console.log("Registration Error: " + error.message);
    }
}

register(events[0]); 
register(events[1]); 
register(events[2]); 