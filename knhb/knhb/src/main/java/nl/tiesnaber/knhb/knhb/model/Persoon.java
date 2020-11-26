package nl.tiesnaber.knhb.knhb.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persoon {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String naam;
    private String geboorteDatum;
    private String adres;
    private String postcode;
    private String plaats;
    private String email;


    public Persoon(String naam, String geboorteDatum, String adres, String postcode, String plaats, String email) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.adres = adres;
        this.postcode = postcode;
        this.plaats = plaats;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}