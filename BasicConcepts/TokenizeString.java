import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        // Splitting the string into tokens based on one or more alphabetic characters
        String[] tokens = s.split("[ !,?._'@]+");
        
        // Printing number of tokens
        System.out.println(tokens.length);
        
        // Printing each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
