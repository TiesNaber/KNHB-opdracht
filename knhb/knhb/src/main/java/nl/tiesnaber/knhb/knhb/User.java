package nl.tiesnaber.knhb.knhb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer user_ID;
    private String userNaam;
    private String wachtwoord;
    private String email;

    public User(String userNaam, String wachtwoord, String email) {
        this.userNaam = userNaam;
        this.wachtwoord = wachtwoord;
        this.email = email;
    }

    public String getUserNaam() {
        return userNaam;
    }

    public void setUserNaam(String userNaam) {
        this.userNaam = userNaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
