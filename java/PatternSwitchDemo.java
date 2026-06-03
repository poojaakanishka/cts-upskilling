/*
30. Pattern Matching for switch (Java 21)
• Objective: Simplify conditional logic with pattern matching in enhanced switch expressions.
• Task: Determine the type of an object and respond accordingly.
• Instructions:
o Create a method that accepts Object as input.
o Use a switch expression to check if the object is Integer, String, Double, etc.
o Print a message based on the object’s type.
*/
public class PatternSwitchDemo {

    static void checkType(Object obj) {

        switch (obj) {

            case Integer i -> System.out.println("It is an Integer: " + i);

            case String s -> System.out.println("It is a String: " + s);

            case Double d -> System.out.println("It is a Double: " + d);

            case Float f -> System.out.println("It is a Float: " + f);

            case null -> System.out.println("Object is null");

            default -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {


        checkType(100);
        checkType("Hello Java");
        checkType(45.67);
        checkType(10.5f);
        checkType(null);
        checkType(true);
    }
}