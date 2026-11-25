//constructor
public class Teacher{
    String name;
    String subject;
    double salary;
    int age;
    boolean isWorking;

    Teacher(String name,String subject,double salary,int age) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.age = age;
        this.isWorking = true;
    }

    void work() {
        System.out.println(this.name + " is in class");
    }
    void free() {
        System.out.println(this.name + " is  free");
    }

}
