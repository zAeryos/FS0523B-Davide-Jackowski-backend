package it.epicode.month1.week1.d3.ex3;

import java.util.Date;

public class Client {

    int clientId;
    String fullName;
    String email;
    Date registrationDate;

    public Client(int clientId, String fullName, String email) {
        this.clientId           = clientId;
        this.fullName           = fullName;
        this.email              = email;
        this.registrationDate   = new Date();
    }

    public int      getClientId() {return this.clientId;};
    public String   getFullName() {return this.fullName;};
    public String   getEmail() {return this.email;};

    public void     setClientId(int clientId) {this.clientId = clientId;};
    public void     setFullName(String fullName) {this.fullName = fullName;};
    public void     setEmail(String email) {this.email = email;};

}
