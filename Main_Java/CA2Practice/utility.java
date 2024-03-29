import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
public class utility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateInput=sc.nextLine();
        //System.out.println(dateInput);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d=LocalDate.parse(dateInput,f);
         System.out.println(d.format(f));
        // String dateinput1=sc.nextLine();
        // LocalDate d1=LocalDate.parse(dateinput1,f);
        // long diff=Math.abs(ChronoUnit.DAYS.between(d,d1));
        // long diffY=Math.abs(ChronoUnit.YEARS.between(d,d1));
        // System.out.println(diff);
        // System.out.println(diffY);
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfYear());
        System.out.println(d.isAfter(d));
        System.out.println(d.minusDays(3));
    }
}
