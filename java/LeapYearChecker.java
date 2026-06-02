/*
4. Leap Year Checker
• Objective: Apply nested conditional logic.
• Task: Check if a given year is a leap year.
• Instructions:
o Prompt the user to enter a year.
o A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
o Display the result accordingly.
*/

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year.");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}