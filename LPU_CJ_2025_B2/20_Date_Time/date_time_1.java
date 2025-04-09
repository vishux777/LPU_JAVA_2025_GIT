import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;

public class date_time_1 {
    public static void main(String[] args) {
        
        //create
        LocalDate date = LocalDate.now();
        // System.out.println(date);

        // LocalDate date = LocalDate.of(2020, 12, 04);
        // System.out.println(date);

        // System.out.println(date.isLeapYear());
        // System.out.println(date.getDayOfWeek());
        // System.out.println(date.getDayOfYear());


        //time
        // LocalTime time = LocalTime.now();
        // System.out.println(time);
        // System.out.println(time.getMinute());

        //date Time
        // LocalDateTime dateTime = LocalDateTime.now();
        // System.out.println(dateTime);

        // DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd / MM / yyyy");

        // String newDate = date.format(formatted);
        // System.out.println(newDate);

        System.out.println(ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
    }
}
