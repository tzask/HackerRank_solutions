import java.util.*;

//https://www.hackerrank.com/challenges/java-date-and-time/problem
public class Solution {
    public static String getDay(String day, String month, String year) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
