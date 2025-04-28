package pluralsight.com;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        System.out.println("Today is: " + today);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");

        String formattedDate = today.format(fmt);

        System.out.println("Today is: " + formattedDate);
    }
}