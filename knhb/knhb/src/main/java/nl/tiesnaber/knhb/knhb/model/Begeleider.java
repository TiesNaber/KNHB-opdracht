package nl.tiesnaber.knhb.knhb.model;

import javax.persistence.Entity;

@Entity
public class Begeleider extends Persoon {

    private int rol_ID;

    public Begeleider(String name, String geboorteDatum, String adres, String postcode, String plaats, String email, int rol_ID) {
        super(name, geboorteDatum, adres, postcode, plaats, email);
        this.rol_ID = rol_ID;
    }



    public int getRol_ID() {
        return rol_ID;
    }

    public void setRol_ID(int rol_ID) {
        this.rol_ID = rol_ID;
    }
}
