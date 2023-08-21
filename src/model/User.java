package model;

import java.util.ArrayList;

public class User {
    String name;
    String password;
    ArrayList<Loan> historic;
    String email;
    //test level 0 - worker, 1 - client
    int level;
    
    //construtor
    public User(){}
    public User( String name, String password, String email, int level){
        this.name = name;
        this.password=password;
        this.email=email;
        this.level = level;
    }

    //get & set
    public String getEmail() {
        return email;
    }
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
    public void setEmail(String email) {
        this.email = email;
    }


    

}
