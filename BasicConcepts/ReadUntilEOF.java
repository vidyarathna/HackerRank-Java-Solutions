import java.util.Scanner;

public class ReadUntilEOF {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);
        
        int lineNumber = 0;  // Initialize a variable to keep track of line numbers
        
        // Read input until EOF using hasNextLine() method
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();  // Read the next line of input
            lineNumber++;  // Increment the line number
            
            // Print the line number followed by the content of the line
            System.out.println(lineNumber + " " + line);
        }
        
        scanner.close();  // Close the scanner to free up resources
    }
}
