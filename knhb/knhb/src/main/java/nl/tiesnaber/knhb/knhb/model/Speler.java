package nl.tiesnaber.knhb.knhb.model;


import javax.persistence.*;

@Entity
public class Speler extends Persoon{

    private int Club_ID;
    private int Team_ID;

    private boolean speelgerechtigd;

    public Speler(){

    }

    public Speler(String naam, String geboorteDatum, String adres, String postcode, String plaats, String email, boolean speelgerechtigd) {
        super(naam, geboorteDatum, adres, postcode, plaats, email);
        this.speelgerechtigd = speelgerechtigd;
    }

    public int getClub_ID() {
        return Club_ID;
    }

    public void setClub_ID(int club_ID) {
        Club_ID = club_ID;
    }

    public int getTeam_ID() {
        return Team_ID;
    }

    public void setTeam_ID(int team_ID) {
        Team_ID = team_ID;
    }

    public boolean isSpeelgerechtigd() {
        return speelgerechtigd;
    }

    public void setSpeelgerechtigd(boolean speelgerechtigd) {
        this.speelgerechtigd = speelgerechtigd;
    }
}
