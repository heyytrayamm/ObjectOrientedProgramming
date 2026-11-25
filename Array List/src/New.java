import java.util.ArrayList;

import java.util.Collections;


public class New {
    public static void main(String[] args) {

        ArrayList<String> Cars = new ArrayList<>();

        Cars.add("Defender");
        Cars.add("LandCruiser");
        Cars.add("Fortuner");
        Cars.add("Thar");

        //Cars.remove(3);
       //Cars.set(1 , "BMW");

        System.out.println(Cars.get(2));
        Collections.sort(Cars);
        System.out.println(Cars);
    }
}
