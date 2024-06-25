import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while (testCases > 0) {
            String line = in.nextLine();
            boolean found = false;

            // Regular expression to find valid tag content
            String regex = "<(.+)>([^<]+)</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
        
        in.close();
    }
}
