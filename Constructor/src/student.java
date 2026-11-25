public class student {

    String name;
    double gpa;
    double height;
    int roll;
    boolean isEnrolled = true;


    student(String name, double gpa, double height, int roll) {
        this.name = name;
        this.gpa = gpa;
        this.height = height;
        this.roll = roll;
        boolean isEnrolled = true;

    }

    void study() {
        if (isEnrolled) {
            System.out.println(name + " " + "is Studying.");
        }
    }
}

