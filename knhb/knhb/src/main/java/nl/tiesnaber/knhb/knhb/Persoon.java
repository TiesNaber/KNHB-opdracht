package nl.tiesnaber.knhb.knhb;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persoon {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    private String geboorteDatum;
    private String adres;
    private String postcode;
    private String plaats;
    private String email;


    public Persoon(String name, String geboorteDatum, String adres, String postcode, String plaats, String email) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}