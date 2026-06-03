/*
7. Type Casting Example
• Objective: Practice type casting between different data types.
• Task: Convert a double to an int and vice versa.
• Instructions:
o Declare a double variable with a decimal value.
o Cast it to an int and display the result.
o Declare an int variable and cast it to a double, then display.
*/


public class TypeCastingExample {

    public static void main(String[] args) {


        double doubleValue = 45.67;
        int intValue = (int) doubleValue;

        System.out.println("Original Double Value: " + doubleValue);
        System.out.println("Double to Int: " + intValue);
        
        int number = 100;
        double convertedDouble = (double) number;

        System.out.println("Original Int Value: " + number);
        System.out.println("Int to Double: " + convertedDouble);
    }
}