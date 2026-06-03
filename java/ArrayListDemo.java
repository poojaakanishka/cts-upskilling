/*
24. ArrayList Example
• Objective: Use dynamic arrays.
• Task: Manage a list of student names.
• Instructions:
o Create an ArrayList to store names.
o Allow the user to add names to the list.
o Display all names entered.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("\nList of Students:");
        for (String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}