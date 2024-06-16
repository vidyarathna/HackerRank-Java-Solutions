import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // Check if lengths are equal
        if (a.length() != b.length()) {
            return false;
        }
        
        // Arrays to count character frequencies
        int[] freqA = new int[26]; // Array for string a
        int[] freqB = new int[26]; // Array for string b
        
        // Count frequencies for string a
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            freqA[ch - 'a']++;
        }
        
        // Count frequencies for string b
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            freqB[ch - 'a']++;
        }
        
        // Compare frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false; // Not anagrams
            }
        }
        
        return true; // Anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        
        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
