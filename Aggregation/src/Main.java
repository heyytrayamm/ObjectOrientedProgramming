public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("A Game of Thrones" , 864);
        Book book2 = new Book("The Count of Monte Cristo" , 1276);
        Book book3 = new Book("War & Piece" , 1440);

        Book[] books = {book1 , book2 , book3};

        Library library = new Library(1851 ,"Midnapore Public Library", books);

        library.displayInfo();
    }
}


