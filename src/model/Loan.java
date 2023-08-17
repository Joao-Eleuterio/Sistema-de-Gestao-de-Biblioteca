package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Loan {
    Book book;
    Date startDate;
    Date endDate;
    boolean returned;

    Loan(){

    }
    public Loan(Book book){
        this.book = book;
        this.startDate = new Date();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        this.endDate = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        this.returned = false;
    }

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

}
