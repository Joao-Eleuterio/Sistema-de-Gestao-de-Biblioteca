package model;

import java.util.Date;

public class Loan {
    Book book;
    Date startDate;
    Date endDate;
    boolean returned;

    //constructor
    Loan(){

    }
    public Loan(Book book){
        this.book = book;
        this.startDate = new Date();
        this.returned = false;
    }

    //get & set
    public Book getBook() {
        return book;
    }
    public Date getEndDate() {
        return endDate;
    }
    public Date getStartDate() {
        return startDate;
    }
    public boolean getReturned() {
        return returned;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public void setReturned(boolean returned) {
        this.returned = returned;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean deliverBack(Book book){
        //if it has already been returned, you cannot return again
        //if not, set the end date and return
        
        if(returned){
            return false;
        }

        setEndDate(new Date());
        setReturned(true);

        return true;
    }


}
