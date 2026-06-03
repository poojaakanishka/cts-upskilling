/*
28. Stream API
• Objective: Process collections using streams.
• Task: Filter and display even numbers from a list.
• Instructions:
o Create a List of integers.
o Use the Stream API to filter even numbers.
o Collect and display the result.
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {

  
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40, 41, 50);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        for (Integer num : evenNumbers) {
            System.out.println(num);
        }
    }
}