/*
6. Arrays and Methods
Scenario: Manage an array of all community events.
Objective: Use array methods for CRUD operations.
Task:
• Add new events using .push()
• Use .filter() to show only music events
• Use .map() to format display cards (e.g., "Workshop on Baking")
*/

let events = [];

events.push({ name: "Music Night", category: "Music" });
events.push({ name: "Workshop on Baking", category: "Workshop" });
events.push({ name: "Rock Concert", category: "Music" });
events.push({ name: "Tech Talk", category: "Technology" });

const musicEvents = events.filter(event => event.category === "Music");

console.log("Music Events:");
musicEvents.forEach(event => {
    console.log(event.name);
});

const displayCards = events.map(event => `${event.name}`);

console.log("\nDisplay Cards:");
displayCards.forEach(card => {
    console.log(card);
});