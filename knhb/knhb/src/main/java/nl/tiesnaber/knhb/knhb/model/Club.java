package nl.tiesnaber.knhb.knhb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer club_ID;

    private String naam;
    private String adres;
    private String plaats;
    private String postcode;
    private String telefoonNummer;
    private String email;

    public Club(String naam, String adres, String plaats, String postcode, String telefoonNummer, String email) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
        this.postcode = postcode;
        this.telefoonNummer = telefoonNummer;
        this.email = email;
    }

    public Integer getClub_ID() {
        return club_ID;
    }

    public void setClub_ID(Integer club_ID) {
        this.club_ID = club_ID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(String telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
