/*
3. Even or Odd Checker
• Objective: Utilize conditional statements.
• Task: Determine if a number entered by the user is even or odd.
• Instructions:
o Prompt the user for an integer.
o Use the modulus operator % to check divisibility by 2.
o Display whether the number is even or odd.
*/


import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        sc.close();
    }
}