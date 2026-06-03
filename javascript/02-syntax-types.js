/*
2. Syntax, Data Types, and Operators
Scenario: Store event details like name, date, and available seats.
Objective: Use proper data types and operations.
Task:
• Use const for event name and date, let for seats
• Concatenate event info using template literals
• Use ++ or -- to manage seat count on registration
*/
const eventName = "Community Meetup";
const eventDate = "10-June-2026";
let availableSeats = 50;

console.log(`Event: ${eventName}, Date: ${eventDate}, Available Seats: ${availableSeats}`);

availableSeats--;

console.log(`Available Seats after registration: ${availableSeats}`);