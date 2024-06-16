import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first string
        String A = sc.next();
        // Read the second string
        String B = sc.next();
        
        // Close the scanner as we do not need it anymore
        sc.close();

        // 1. Sum the lengths of A and B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // 2. Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter in A and B and print them
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
