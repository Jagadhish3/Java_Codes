import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DTF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date=LocalDate.parse(s,f);
        LocalDate date1=LocalDate.parse(s1,f);
        System.out.println(date.format(f));
        System.out.println(date1.format(f));
        System.out.println(date1.getDayOfWeek());
        long diff=Math.abs(ChronoUnit.YEARS.between(date,date1));
        System.out.println(diff);
        
        int sun=0;
        LocalDate c=date;
        while(!c.isAfter(date1)){
            if(c.getDayOfWeek()==DayOfWeek.SUNDAY){
                sun++;
            }
            c=c.plusDays(1);
        }
        System.out.println(sun);
    }
}
