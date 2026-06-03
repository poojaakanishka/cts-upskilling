/*
25. HashMap Example
• Objective: Use key-value pairs.
• Task: Map student IDs to names.
• Instructions:
o Create a HashMap with Integer keys and String values.
o Allow the user to add entries.
o Retrieve and display a name based on an entered ID.
*/import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student ID not found!");
        }

        sc.close();
    }
}
