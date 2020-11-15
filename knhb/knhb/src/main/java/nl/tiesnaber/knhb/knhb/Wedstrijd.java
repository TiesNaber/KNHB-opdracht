package nl.tiesnaber.knhb.knhb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wedstrijd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer wedstrijd_ID;
    private int ScheidsPersoon_ID;
    private int thuisTeam_ID;
    private int uitTeam_ID;

    private String wedstrijdDatum;
    private int doelpuntenThuis;
    private int doelpuntenUit;

    public Wedstrijd(int scheidsPersoon_ID, int thuisTeam_ID, int uitTeam_ID, String wedstrijdDatum, int doelpuntenThuis, int doelpuntenUit) {
        ScheidsPersoon_ID = scheidsPersoon_ID;
        this.thuisTeam_ID = thuisTeam_ID;
        this.uitTeam_ID = uitTeam_ID;
        this.wedstrijdDatum = wedstrijdDatum;
        this.doelpuntenThuis = doelpuntenThuis;
        this.doelpuntenUit = doelpuntenUit;
    }

    public int getScheidsPersoon_ID() {
        return ScheidsPersoon_ID;
    }

    public void setScheidsPersoon_ID(int scheidsPersoon_ID) {
        ScheidsPersoon_ID = scheidsPersoon_ID;
    }

    public int getThuisTeam_ID() {
        return thuisTeam_ID;
    }

    public void setThuisTeam_ID(int thuisTeam_ID) {
        this.thuisTeam_ID = thuisTeam_ID;
    }

    public int getUitTeam_ID() {
        return uitTeam_ID;
    }

    public void setUitTeam_ID(int uitTeam_ID) {
        this.uitTeam_ID = uitTeam_ID;
    }

    public String getWedstrijdDatum() {
        return wedstrijdDatum;
    }

    public void setWedstrijdDatum(String wedstrijdDatum) {
        this.wedstrijdDatum = wedstrijdDatum;
    }

    public int getDoelpuntenThuis() {
        return doelpuntenThuis;
    }

    public void setDoelpuntenThuis(int doelpuntenThuis) {
        this.doelpuntenThuis = doelpuntenThuis;
    }

    public int getDoelpuntenUit() {
        return doelpuntenUit;
    }

    public void setDoelpuntenUit(int doelpuntenUit) {
        this.doelpuntenUit = doelpuntenUit;
    }
}
