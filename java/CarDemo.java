/*
17. Class and Object Creation
• Objective: Understand classes and objects.
• Task: Create a Car class with attributes and methods.
• Instructions:
o Define attributes: make, model, year.
o Implement a method displayDetails() to print car information.
o Create objects of the Car class and call the method.
*/

class Car {

    // Attributes
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("----------------------");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2022;

        car1.displayDetails();
        car2.displayDetails();
    }
}