public class Main {
    public static void main(String[] args) {

        Bike[] bikes = {new Bike("Splender" , "red"),
                new Bike ("pulser" , "Blue"),
                new Bike ("R15" , "Green")
        };

        for(Bike bike : bikes)  {
            bike.colour = "BLACK";
            System.out.println(bike.name);
            System.out.println(bike.colour);
            bike.drive();
        }
    }
}