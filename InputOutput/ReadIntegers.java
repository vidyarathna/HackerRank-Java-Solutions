import java.util.Scanner;

public class ReadIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);
        
        // Read input until there is no more data
        while (scanner.hasNext()) {
            // Read the next integer from input
            int number = scanner.nextInt();
            
            // Print the integer
            System.out.println(number);
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }
}
