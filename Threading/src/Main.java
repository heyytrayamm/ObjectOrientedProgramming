import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter you name within 5 seconds");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " !! ");

        scanner.close();

    }
}
