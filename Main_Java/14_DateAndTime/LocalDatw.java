import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class LocalDatw {
    public static void main(String[] args) {
        // LocalDate ld=LocalDate.of(1981,2,27);
        // System.out.println(ld.isLeapYear());
        // System.out.println(ld);

        // System.out.println(ld.format(DateTimeFormatter.BASIC_ISO_DATE));

        ZoneId z1 = ZoneId.of("Asia/Kolkata");
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
    }
}
//Print the current time of New York City