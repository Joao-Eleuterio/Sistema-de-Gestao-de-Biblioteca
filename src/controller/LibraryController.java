package controller;

import java.util.ArrayList;
import model.*;

public class LibraryController {
    // "DB"
    static ArrayList<Book> books = new ArrayList<Book>();
    static ArrayList<User> users = new ArrayList<User>();

    public static void addLoan(User user, Book book) {
        // if this book is already loaned, you cannot loan it.
        if (!alreadyLoaned(book)) {
            Loan loan = new Loan(book);
            ArrayList<Loan> historic = (user.getHistoric() != null) ? user.getHistoric() : new ArrayList<Loan>();
            historic.add(loan);
            user.setHistoric(historic);
        }
    }

    private static boolean alreadyLoaned(Book book) {
        for (User user : users) {
            ArrayList<Loan> historic = (user.getHistoric() != null) ? user.getHistoric() : new ArrayList<Loan>();
            for (int i = 0; i < historic.size(); i++) {
                if (historic.get(i).getBook() == book) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean addBook(String title, int year, int nr_copies, String author) {
        //if the book already exists it is impossible to add it, otherwise you can add
        boolean alreadyExist = false;
        for (Book book : books) {
            if(book.getAuthor()==author && book.getTitle()==title && book.getYear()==year && book.getNr_copies()==nr_copies){
                alreadyExist=true;
                break;
            }
        }
        if(!alreadyExist){
            books.add(new Book(title,year,nr_copies,author));
            return true;
        }
        return false;
        
    }

    public static boolean removeBook(Book book) {
        //if the book is on loan it is impossible to remove it, otherwise you can remove
        boolean alreadyLoaned= false;
        for (User user : users) {
            ArrayList<Loan> historic = (user.getHistoric() != null) ? user.getHistoric() : new ArrayList<Loan>();
            for (int i = 0; i < historic.size(); i++) {
                if (historic.get(i).getBook() == book && !historic.get(i).getReturned()) {
                    alreadyLoaned = true;
                    break;
                }
            }
        }
        if(!alreadyLoaned){
            books.remove(book);
            return true;
        }
        return false;
    }
    //Login & Register
    public boolean login(String email, String password){    
        for (User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean register(String name, String email, String password, int level){
        for (User user : users) {
            if(user.getEmail()==email && user.getPassword()==password && user.getName()==name){
                return false;
            }
        }
        users.add(new User(name, password, email, level));
        return true;
    }
}

