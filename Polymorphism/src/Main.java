public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        car.drive();
//        bike.drive();
//        boat.drive();

        Vehicle[] vehicles = {car,bike,boat};

        for (Vehicle  v : vehicles){
            v.drive();
        }
    }

}
