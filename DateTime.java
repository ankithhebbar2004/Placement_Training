import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
//        LocalDateTime now;
//        now = LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(LocalDate.now().getYear());
//          LocalDate now = LocalDate.now();
//          DayOfWeek dow = now.getDayOfWeek();
//          System.out.println(DayOfWeek.SUNDAY.getValue());
//          System.out.println(dow.name());
//          System.out.println(dow.getValue());
//        int y = 2025;
//        int m = 7;
//        int d = 19;
//       System.out.println(LocalDate.of(y,m,d).getDayOfWeek());
//        LocalDate today, tomorrow;
//        today = LocalDate.now();
//        tomorrow = LocalDate.of(y,m,d);
        int y = 2025;
        int m = 03;
        int d = 26;

        LocalDate today = LocalDate.now();
        int cm = today.getMonthValue();
        LocalDate targetDate = LocalDate.of(y, m, d);

        if(cm>m){
            System.out.println("COmpleted");
        } else if(cm<m){
            System.out.println("Yet to come");
        } else if(cm==m){
            int cd = today.getDayOfMonth();
            if(cd > d){
                System.out.println("Completed");
            } else if(cd < d){
                System.out.println("Yet to come");
            } else if(cd == d){
                System.out.println("Today is your birthday");
            }
        }

//        long daysLeft = today.datesUntil(targetDate).count();
//        ChronoUnit.DAYS.between(today, targetDate);
//        System.out.println("Days left until " + targetDate + ": " + daysLeft);
    }
}
