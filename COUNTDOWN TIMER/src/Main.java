import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    //JAVA COUNTDOWN TIMER PROGRAM
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Timer you want to add? ");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = scanner.nextInt();
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count <= 0) {
                    System.out.println("Happy New Year !!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task ,0000, 1000);
    }
}
