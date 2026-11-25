import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Currenttime {

    public static void main(String[] args) {
        //LocalDate date = LocalDate.now();
        //LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        //UTC time printing
        Instant instant = Instant.now();
        System.out.print(instant);



    }

}
