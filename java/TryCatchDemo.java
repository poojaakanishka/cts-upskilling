/*
20. Try-Catch Example
• Objective: Handle exceptions gracefully.
• Task: Handle division by zero using try-catch.
• Instructions:
o Prompt the user for two integers.
o Attempt to divide the first by the second.
o Catch any ArithmeticException and display an appropriate message.
*/
import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.close();
    }
}