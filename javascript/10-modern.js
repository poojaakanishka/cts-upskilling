/*
10. Modern JavaScript Features
Scenario: Refactor code to be concise and maintainable.
Objective: Use ES6+ features.
Task:
• Use let, const, default parameters in functions
• Use destructuring to extract event details
• Use spread operator to clone event list before filtering
*/

const events = [
    { name: "Music Night", category: "Music", seats: 50 },
    { name: "Workshop on Baking", category: "Workshop", seats: 30 },
    { name: "Tech Talk", category: "Technology", seats: 20 }
];

function displayEvent(eventName = "Unknown Event") {
    console.log(`Event: ${eventName}`);
}

const { name, category, seats } = events[0];

console.log("Event Details:");
console.log(`Name: ${name}`);
console.log(`Category: ${category}`);
console.log(`Seats: ${seats}`);

let clonedEvents = [...events];

const musicEvents = clonedEvents.filter(
    event => event.category === "Music"
);

console.log("\nMusic Events:");
musicEvents.forEach(event => {
    console.log(event.name);
});

displayEvent(name);