import java.util.Scanner;

class MyRegex {
    String pattern;

    public MyRegex() {
        pattern = "^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$";
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(myRegex.pattern));
        }

        in.close();
    }
}
