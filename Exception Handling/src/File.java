import java.util.InputMismatchException;
import java.util.Scanner;
public class File {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("Cant devide !");
        } catch (InputMismatchException e) {
            System.out.println("not a number");
        } finally {
            System.out.println("This will be executed always");
        }

    }
}
