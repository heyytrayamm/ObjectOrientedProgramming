import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2026,11,24,13,39,20);
        LocalDateTime date2 = LocalDateTime.of(2027 ,1, 1, 10 , 30 , 45);


        if(date1.isBefore(date2)) {
            System.out.println(date1);
        }
        else if (date1.isAfter(date2)) {
            System.out.println(date2);
        }

        else if (date1.isEqual(date2)) {
            System.out.println(date1 + "is equal to " + date2);
        }
    }
}
