public class Main {
    public static void main(String[] args) {
        //Integer a = new Integer(123);
        //Double b = new Double(123.45);
        //Character c = new Character('$');
        //Boolean d = new Boolean(true);

        //Autoboxing
       //Integer a = 123;
        //Double b = 123.45;
        //Character c = '$';
        //Boolean d = true;
        //String e = "Pizza";

        //Unboxing
        //int x = a;
        //double y = b;
        //char z = c;
        //boolean w = d;
        //String f = e;

        //Conversion of primitive values into String
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(true);

        String x = a + b + c + d;
        System.out.println(x);

        //Conversion of Strings into primitive values
        int l = Integer.parseInt("123");
        double m = Double.parseDouble("3.14");
        char n = "Pizza".charAt(2);
        boolean o = Boolean.parseBoolean("true");

        //some static Utility methods

        char letter = 'b';
        System.out.println(letter);
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }

}
