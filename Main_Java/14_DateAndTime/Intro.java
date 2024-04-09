import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intro {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(format));
        // System.out.println(date);
        // System.out.println(date.plusDays(3));

        // System.out.println(time);
        System.out.println(dateTime);
    }
}
