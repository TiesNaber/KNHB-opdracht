package nl.tiesnaber.knhb.knhb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer team_ID;

    private int club_ID;
    private String teamNaam;

    private ArrayList<Speler> spelers;

    public Team(){

    }

    public Team(Integer club_ID, String teamNaam) {
        this.club_ID = club_ID;
        this.teamNaam = teamNaam;
    }

    public void addSpeler(Speler speler){

        if(speler !=null){
            speler.setTeam_ID(team_ID);
            spelers.add(speler);
        }
    }

    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public void setSpelers(ArrayList<Speler> spelers) {
        this.spelers = spelers;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public Integer getTeam_ID() {
        return team_ID;
    }

    public void setTeam_ID(Integer team_ID) {
        this.team_ID = team_ID;
    }

    public int getClub_ID() {
        return club_ID;
    }

    public void setClub_ID(int club_ID) {
        this.club_ID = club_ID;
    }
}
