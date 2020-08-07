package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @Column(name = "username")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    @Column(name = "passcode")
    private String passcode;

    public Account(String username, String password) {
        this.username = username;
        this.passcode = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return username.equals(account.username) &&
                passcode.equals(account.passcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, passcode);
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
