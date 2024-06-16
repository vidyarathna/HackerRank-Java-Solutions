import java.util.Scanner;

public class SubstringExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the string S
        String S = scanner.next();
        
        // Read the start and end indices
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Extract the substring from start to end (inclusive)
        String substring = S.substring(start, end + 1);
        
        // Print the substring
        System.out.println(substring);
    }
}
