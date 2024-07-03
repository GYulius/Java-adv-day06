package inputoutput.example01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// A class that demonstrates writing to a file using FileOutputStream
public class WriteFileExample {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream to write to the file
            FileOutputStream fos = new FileOutputStream("src/main/java/inputoutput/example01/output.txt");
            String data = "Hello frate"; // Data to be written to the file
            try {
                fos.write(data.getBytes()); // Write the data to the file as bytes
            } catch (IOException e) {
                e.printStackTrace(); // Print the stack trace if an IOException occurs
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Print the stack trace if the file is not found
        }
    }
}