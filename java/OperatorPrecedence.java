/*
8. Operator Precedence
• Objective: Explore how Java evaluates expressions.
• Task: Evaluate and display the result of complex expressions.
• Instructions:
o Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;.
o Display the result and explain the order of operations.
*/

public class OperatorPrecedence {

    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 2 + 3 * 4;
        int result4 = 10 + 20 - 5 * 2;

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("20 / 2 + 3 * 4 = " + result3);
        System.out.println("10 + 20 - 5 * 2 = " + result4);

        System.out.println("\nExplanation:");
        System.out.println("Multiplication and Division are performed before Addition and Subtraction.");
        System.out.println("Parentheses have the highest precedence.");
    }
}