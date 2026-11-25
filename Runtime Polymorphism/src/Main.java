import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What will you Choose? " +
                "(1 for Dog 2 for Cat) :");

        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }

        else if(choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
