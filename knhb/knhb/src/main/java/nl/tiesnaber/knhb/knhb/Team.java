package nl.tiesnaber.knhb.knhb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer team_ID;

    private int club_ID;
    private int begeleider_ID;

    public Team(int club_ID, int begeleider_ID) {
        this.club_ID = club_ID;
        this.begeleider_ID = begeleider_ID;
    }

    public int getClub_ID() {
        return club_ID;
    }

    public void setClub_ID(int club_ID) {
        this.club_ID = club_ID;
    }

    public int getBegeleider_ID() {
        return begeleider_ID;
    }

    public void setBegeleider_ID(int begeleider_ID) {
        this.begeleider_ID = begeleider_ID;
    }
}
