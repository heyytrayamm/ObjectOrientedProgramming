public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.45);
        Rectangle rectangle = new Rectangle(14,20);
        Triangle triangle = new Triangle(6,8);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        circle.display();
        triangle.display();
        rectangle.display();




    }
}
