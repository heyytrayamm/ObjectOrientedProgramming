public class TestMain {
    public static void main(String[] args) {
        student s1 = new student("Trayam" , 8.5 , 5.6 , 17);
        student s2 = new student("Mim" , 9.5 , 5.6 , 39);

        System.out.println(s1.name);
        System.out.println(s2.name);
        s1.study();
        s2.study();
        System.out.println(s1.height);
    }

}