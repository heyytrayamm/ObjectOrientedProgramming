//ENGINE is a part of CAR

public class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
    void start() {
        System.out.println("The Engine " + this.type + " " + "is Starting");
    }
}
