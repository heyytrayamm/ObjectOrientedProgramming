public class Main {
    public static void main(String[] args) {

        Product<String , Integer> product1 = new Product<>("apple" , 25);
        Product<String , Double> product2 = new Product<>("mango" , 19.56);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
