public class Car {

    private final String model;
    private String colour;
    private int price;

    Car(String model,String colour,int price) {
        this.model = model;
        this.colour =colour;
        this.price = price;
    }

    //GETTER to read private fields
    String getModel() {
        return this.model;
    }

    String getColour() {
        return this.colour;
    }

    String getPrice() {
        return "$" + this.price;
    }

    //SETTER to write private fields
    void setColour(String colour) {
        this.colour = colour;
    }

    void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Price cant be negetive");
        }
        else {
            this.price = price;
        }
    }


}
