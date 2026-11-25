public class Dog implements Sprint,Float{

    @Override
    public void run() {
        System.out.println("The Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("The Dog is swimming");
    }
}
