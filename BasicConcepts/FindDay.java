import java.util.Calendar;
import java.util.Locale;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance and set the date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        
        // Get the day of the week from the calendar
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Convert the day of the week to a string
        String dayString = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
        
        return dayString;
    }

    public static void main(String[] args) {
        // Sample input
        int month = 8;
        int day = 5;
        int year = 2015;
        
        // Call the findDay method and print the result
        System.out.println(findDay(month, day, year));
    }
}
