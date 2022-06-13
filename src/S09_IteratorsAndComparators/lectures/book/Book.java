package S09_IteratorsAndComparators.lectures.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    private void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    private void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public List<String> getAuthors() {
        return authors;
    }
}
