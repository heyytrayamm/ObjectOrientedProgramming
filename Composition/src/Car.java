//CAR is made of ENGINE
//If CAR is deleted ENGINE cant be accessed anymore
public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void run() {
        this.engine.start();
        System.out.println("The" + " " + this.model + " is Running");

    }


}
