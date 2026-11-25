import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Day ? ");
        String response = scanner.nextLine().toUpperCase();



        try {
            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("This is a Weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("This is a Weekend");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day !!");
        }
        scanner.close();
        }
    }