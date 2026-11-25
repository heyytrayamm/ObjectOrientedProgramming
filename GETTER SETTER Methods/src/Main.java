public class Main {
    public static void main(String[] args) {
        Car car = new Car("Foutuner" , "Black" , 5000000);

        car.setColour("White");
        car.setPrice(7000000);


        System.out.println(car.getPrice() + " " + car.getColour() + " " + car.getModel());
    }
}
