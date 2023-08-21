package model;

public class Book {
    String title;
    int year;
    int nr_copies;
    String author;

    public Book(String title, int year, int nr_copies, String author) {
        this.title=title;
        this.year=year;
        this.nr_copies=nr_copies;
        this.author=author;
    }
    //get & set
    public String getAuthor() {
        return author;
    }
    public int getNr_copies() {
        return nr_copies;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNr_copies(int nr_copies) {
        this.nr_copies = nr_copies;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
