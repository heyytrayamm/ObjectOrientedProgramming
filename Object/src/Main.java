public class Main {

    public static void main(String[] args) {

        /** Scanner scanner = new Scanner(System.in);
         This is an example of Creating A new Object.
         here Scanner is the Class file provided by java,
         scanner is the reference variable which refers to the Scanner object
         new Scanner is the object (instance) created from the Scanner class
         and theSystem.in tells the Scanner to take input from keyboard.
         **/

        Car car = new Car();

        System.out.println(car.maker + " " + car.model + " Costs arround " + car.price + " Lacks ");

        System.out.println(car.isRunning);
        car.Start();
        System.out.println(car.isRunning);
        car.Drive();
        System.out.println(car.isRunning);
        car.Stop();
        System.out.println(car.isRunning);
    }
}
