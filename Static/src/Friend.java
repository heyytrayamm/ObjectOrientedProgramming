public class Friend {

    String name;
    static int noOfFriends;

    //staic makes a variable or method belong to a class.
    //rather than belong to any specifc object.
    //and commonly used as utility methods or shared resources.


    //constructor
    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }
}
