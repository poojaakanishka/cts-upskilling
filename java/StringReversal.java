/*
15. String Reversal
• Objective: Manipulate strings.
• Task: Reverse a string entered by the user.
• Instructions:
o Prompt the user for a string.
o Use a loop or StringBuilder to reverse the string.
o Display the reversed string.
*/
import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed1 = new StringBuilder(str).reverse().toString();

        // Method 2: Using loop
        String reversed2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed2 += str.charAt(i);
        }

        System.out.println("Reversed string (StringBuilder): " + reversed1);
        System.out.println("Reversed string (Loop): " + reversed2);

        sc.close();
    }
}