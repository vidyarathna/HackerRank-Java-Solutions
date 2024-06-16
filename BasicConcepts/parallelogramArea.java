import java.util.Scanner;

public class ParallelogramArea {
    // Static variables for breadth and height
    static int B;
    static int H;
    static boolean flag = true; // Flag to check if the input is valid
    
    // Static initialization block
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        
        // Check if breadth and height are positive
        if (B <= 0 || H <= 0) {
            flag = false; // Set flag to false if any input is non-positive
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        // If the input is valid, calculate and print the area
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
