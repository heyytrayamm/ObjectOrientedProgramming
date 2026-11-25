public class Main {
    public static void main (String [] args) {

        Teacher teacher1 = new Teacher("Kk" ,"oops" , 28000 , 42 );
        Teacher teacher2 = new Teacher("sbm" ,"python" , 40000 , 36 );
        Teacher teacher3 = new Teacher("Ratna" , "Dsa" , 15000 , 38 );

        System.out.println(teacher1.name);
        System.out.println(teacher2.subject);
        System.out.println(teacher3.subject);
        System.out.println(teacher3.isWorking);
        teacher1.work();
        teacher2.free();
    }
}
