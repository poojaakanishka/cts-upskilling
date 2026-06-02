/*
5. Multiplication Table
• Objective: Implement loops.
• Task: Print the multiplication table for a number up to 10.
• Instructions:
o Prompt the user for a number.
o Use a for loop to iterate from 1 to 10.
o Multiply the input number by the loop counter and display the result.
*/

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}