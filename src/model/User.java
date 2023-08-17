package model;

import java.util.ArrayList;

public class User {
    String name;
    String password;
    ArrayList<Loan> historic;

    public ArrayList<Loan> getHistoric() {
        return historic;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setHistoric(ArrayList<Loan> historic) {
        this.historic = historic;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
