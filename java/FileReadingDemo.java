/*
23. File Reading
• Objective: Read data from a file.
• Task: Read and display the contents of output.txt.
• Instructions:
o Open output.txt for reading.
o Read each line and display it on the console.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingDemo {

    public static void main(String[] args) {

        try {
            // Open file
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);

            // Read and display each line
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: output.txt");
        }
    }
}