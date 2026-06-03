/*
5. Objects and Prototypes
Scenario: Each event is an object with properties and methods.
Objective: Model real-world entities using objects.
Task:
• Define Event constructor or class
• Add checkAvailability() to prototype
• List object keys and values using Object.entries()
*/
function Event(name, category, seats) {
    this.name = name;
    this.category = category;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    if (this.seats > 0) {
        console.log(`${this.name} is available. Seats left: ${this.seats}`);
    } else {
        console.log(`${this.name} is full.`);
    }
};

const event1 = new Event("Music Night", "Music", 50);
const event2 = new Event("Tech Talk", "Technology", 0);

event1.checkAvailability();
event2.checkAvailability();

console.log("\nEvent Details:");

Object.entries(event1).forEach(([key, value]) => {
    console.log(`${key}: ${value}`);
});