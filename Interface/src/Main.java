public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Dog dog = new Dog();

        rabbit.run();
        fish.swim();
        dog.run();
        dog.swim();
    }
}
