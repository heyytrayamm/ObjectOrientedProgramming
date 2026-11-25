public class Library {
    int year;
    String name;
    Book[] books;

    Library(int year, String name , Book[] books) {
        this.year = year;
        this.name = name;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("THE" + " " + this.year + " " + this.name.toUpperCase());

        System.out.println("Available Books:");

        for(Book b : books) {
            System.out.println(b.displayBooks());
        }
    }
}
