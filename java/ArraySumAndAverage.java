/*
14. Array Sum and Average
• Objective: Work with arrays and perform calculations.
• Task: Calculate the sum and average of elements in an array.
• Instructions:
o Prompt the user to enter the number of elements.
o Read the elements into an array.
o Calculate and display the sum and average.
*/


import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}