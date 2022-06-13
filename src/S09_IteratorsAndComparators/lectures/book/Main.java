package S09_IteratorsAndComparators.lectures.book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("Animal Farm", 2003 , "George Orwell");
        Book bookThree = new Book("The Documents in the Case&quot", 2002);
        Book bookTwo = new Book("The Documents in the Case&quot", 1930, "Dorothy Sayers&quot", "Robert Eustace");
        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
    }
}
