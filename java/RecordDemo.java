/*
29. Records
• Objective: Use the record keyword for immutable data structures (Java 16+).
• Task: Create a record to represent a Person with name and age.
• Instructions:
o Define a record named Person.
o Create instances and print them.
o Use records in a List and filter based on age using Streams.
*/

record Person(String name, int age) { }

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecordDemo {

    public static void main(String[] args) {

        // Create Person objects using record
        Person p1 = new Person("Arun", 20);
        Person p2 = new Person("Meena", 17);
        Person p3 = new Person("Kavi", 22);
        Person p4 = new Person("Ravi", 16);

        System.out.println("All Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        List<Person> people = Arrays.asList(p1, p2, p3, p4);

        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (age >= 18):");
        for (Person p : adults) {
            System.out.println(p);
        }
    }
}