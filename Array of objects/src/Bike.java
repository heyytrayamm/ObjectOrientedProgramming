//array of objects

public class Bike {
    String name;
    String colour;
    Bike(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    void drive() {
        System.out.println(this.name + " is Driving");
    }
    void rest() {
        System.out.println(this.name + " is resting");
    }
}
