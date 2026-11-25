public class Person {
    String first;
    String last;

    //Constructor
    Person(String first,String last){
        this.first = first;
        this.last = last;
    }

    public Person() {
    }

    void ShowName(){
        System.out.println(this.first + " " + this.last);
    }



}
