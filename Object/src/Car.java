public class Car {
    String maker = "Toyota";
    String model = "Fortuner";
    String color = "Black";
    double price =  50.46;
    boolean isRunning = false;
    int year = 2026;

    public void Start () {
        System.out.println("You Start the Car !");
        isRunning = true;
    }

    public void Drive () {
        System.out.println("You Drive the Car !");
    }

    public void Stop () {
        System.out.println("You stop the Car !");
        isRunning = false;
    }


}
