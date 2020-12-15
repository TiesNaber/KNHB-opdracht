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


    public Team(){

    }

    public Team(Integer club_ID, String teamNaam) {
        this.club_ID = club_ID;
        this.teamNaam = teamNaam;
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
