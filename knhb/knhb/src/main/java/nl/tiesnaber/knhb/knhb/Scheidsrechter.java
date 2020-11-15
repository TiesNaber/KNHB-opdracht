package nl.tiesnaber.knhb.knhb;

import javax.persistence.Entity;

@Entity
public class Scheidsrechter extends Persoon{

    private int wedstrijd_ID;
    private int scheidsRechters_ID;

    public Scheidsrechter(String name, String geboorteDatum, String adres, String postcode, String plaats, String email, int wedstrijd_ID, int scheidsRechters_ID) {
        super(name, geboorteDatum, adres, postcode, plaats, email);
        this.wedstrijd_ID = wedstrijd_ID;
        this.scheidsRechters_ID = scheidsRechters_ID;
    }

    public int getWedstrijd_ID() {
        return wedstrijd_ID;
    }

    public void setWedstrijd_ID(int wedstrijd_ID) {
        this.wedstrijd_ID = wedstrijd_ID;
    }

    public int getScheidsRechters_ID() {
        return scheidsRechters_ID;
    }

    public void setScheidsRechters_ID(int scheidsRechters_ID) {
        this.scheidsRechters_ID = scheidsRechters_ID;
    }
}
