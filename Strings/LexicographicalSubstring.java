public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);  // Initialize with the first substring of length k
        String largest = s.substring(0, k);
        
        // Loop through all possible substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);
            
            // Compare currentSubstring with smallest and largest found so far
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;  // Found a smaller substring
            }
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;   // Found a larger substring
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}
