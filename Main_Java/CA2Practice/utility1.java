import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
public class utility1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date=sc.nextLine();
        String date1=sc.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate c=LocalDate.parse(date,f);
        LocalDate d=LocalDate.parse(date1,f);
        // System.out.println(c.format(f));
        // int s=0;
        // while(!c.isAfter(d)){
        //     if(c.getDayOfWeek()==DayOfWeek.SUNDAY){
        //         s++;
        //     }
        //     c=c.plusDays(1);
        // }
        // System.out.println(s);
        while(!c.isAfter(d)){
            System.out.println(c.format(f));
            c=c.plusDays(2);
        }
    }
}
