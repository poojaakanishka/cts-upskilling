/*
6. Data Type Demonstration
• Objective: Understand Java's primitive data types.
• Task: Declare variables of different primitive types and display their values.
• Instructions:
o Declare variables of types int, float, double, char, and boolean.
o Assign appropriate values to each.
o Use System.out.println() to display each variable.
*/


public class DataTypeDemo {

    public static void main(String[] args) {

        int age = 20;
        float height = 5.8f;
        double salary = 45000.75;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Integer Value: " + age);
        System.out.println("Float Value: " + height);
        System.out.println("Double Value: " + salary);
        System.out.println("Character Value: " + grade);
        System.out.println("Boolean Value: " + isStudent);
    }
}