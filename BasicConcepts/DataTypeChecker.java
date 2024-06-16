import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < t; i++) {
            try {
                // Read the integer input
                long x = scanner.nextLong();
                
                // Print the appropriate message based on the range of data types
                System.out.println(x + " can be fitted in:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // If the input is out of range for all data types
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}
