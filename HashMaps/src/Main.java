import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String , Double> map = new HashMap<>();

        map.put("apple" , 0.50);
        map.put("Orange" , 0.75);
        map.put("Banana" , 0.25);

        //overriding the value of a key
        //map.put("apple" , 0.95);

        //deleting a key
        //map.remove("apple");

        //to check whether a key is in the hashmap
        //System.out.println(map.containsKey("apple"));

        //to check whether a value is in the hashmap
        //System.out.println(map.containsValue(0.75));

        //to get the value of a key
        //System.out.println(map.get("apple"));

//        if(map.containsKey("apple")) {
//            System.out.println(map.get("apple"));
//        }

        //System.out.println(map);

        //to print the hashmap in a good way
        for( String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}
