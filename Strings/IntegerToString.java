import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        int n = scanner.nextInt();
        
        // Close the scanner to free up resources
        scanner.close();
        
        // Convert the integer to a string
        try {
            String s = Integer.toString(n);
            
            // Check if the conversion is successful
            if (s.equals(String.valueOf(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
