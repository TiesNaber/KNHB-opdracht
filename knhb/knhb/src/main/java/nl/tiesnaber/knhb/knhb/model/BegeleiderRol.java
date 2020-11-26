package nl.tiesnaber.knhb.knhb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BegeleiderRol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rol_ID;

    private String rol_type;

    public BegeleiderRol(String rol_type) {
        this.rol_type = rol_type;
    }

    public Integer getRol_ID() {
        return rol_ID;
    }

    public void setRol_ID(Integer rol_ID) {
        this.rol_ID = rol_ID;
    }

    public String getRol_type() {
        return rol_type;
    }

    public void setRol_type(String rol_type) {
        this.rol_type = rol_type;
    }
}
