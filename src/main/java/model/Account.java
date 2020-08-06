package model;

import javax.persistence.*;

@Entity
@Table(name = "Account", schema = "public")
public class Account {

    @Id
    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "passcode")
    private String passcode;

    public Account(String username, String password) {
        this.username = username;
        this.passcode = password;
    }

    public Account() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", passcode='" + passcode + '\'' +
                '}';
    }


}
