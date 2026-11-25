//Creating An ArrayList with elements of user's choice and user's number
import java.util.Scanner;
import java.util.ArrayList;

public class Fruits {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        int numOfFruits;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Fruits : ");
        numOfFruits = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i <numOfFruits; i++) {

            System.out.print("Enter Fruit #" + (i+1)  + " : ");
            Scanner sc = new Scanner(System.in);
            String FRUIT= scanner.nextLine();
            fruits.add(FRUIT);
        }

        System.out.println(fruits);



        scanner.close();
    }
}
