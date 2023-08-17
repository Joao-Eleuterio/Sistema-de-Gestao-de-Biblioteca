package controller;
import java.util.ArrayList;

import model.*;

public class LibraryController {
    public static void addLoan(User user,Book book){
        //add to db instead of an arraylist
        ArrayList<Loan> historic = user.getHistoric();
        Loan loan = new Loan(book);
        historic.add(loan);
    }
    public static void addBook(String title,int year, int nr_copies, String author) {
        //add book from db
    }


    public static void removeBook(Book book) {
        //remove book from db
    }
}

//TODO fazer BD para guardar tudo
