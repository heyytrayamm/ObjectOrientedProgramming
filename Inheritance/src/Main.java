public class Main {
    public static void main(String[] args) {

        Plant plant = new Plant();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(plant.isAlive);
        dog.speak();
        cat.speak();
        plant.photosynthesis();

    }
}
