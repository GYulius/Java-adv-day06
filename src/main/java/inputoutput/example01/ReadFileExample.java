package inputoutput.example01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// A class that demonstrates reading from a file using FileInputStream
public class ReadFileExample {

    public static void main(String[] args) {
        try {
            // Create a FileInputStream to read the file
            FileInputStream fis = new FileInputStream("src/main/java/inputoutput/example01/output.txt");
            int i;
            // Read the file character by character until the end of the file is reached
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Print each character read from the file
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace if an IOException occurs
        }
    }
}