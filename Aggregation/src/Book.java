public class Book {
    String name;
    int pages;

    Book(String name , int pages) {
        this.name = name;
        this.pages = pages;
    }
    String displayBooks() {
        return this.name + " " + "(" + this.pages + ")";
    }
}
