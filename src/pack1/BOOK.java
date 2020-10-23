package pack1;

import java.lang.*;
public class BOOK {
    private String author;
    private int year;

    public BOOK(String a, int y){
        author = a;
        year = y;
    }

    public BOOK(String a){
        author = a;
        year = 1814;
    }

    public BOOK() {
        author = "Palanik";
        year = 1962;
    }

    public void setYear(int year) {this.year = year;}
    public void setAuthor(String author) {this.author = author;}
    public String getAuthor() {return author;}
    public int getYear() {return year;}
    public String toString() {return "Book`s author " + author + ", and its date of issue is — " + year;}

}