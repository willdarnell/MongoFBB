package MongoFBB.demo.Entities;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Owner {

    @Id
    public String id;



    public String ownerName;
    public String ownerEmail;
    public String ownerLoginId;
    public String teamName;
    public Team team;

    public Owner(){};

    public Owner(String ownerName, String ownerEmail, String teamName){
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.team = new Team(teamName, ownerName);
        this.teamName = this.team.getTeamName();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerLoginId() {
        return ownerLoginId;
    }

    public void setOwnerLoginId(String ownerLoginId) {
        this.ownerLoginId = ownerLoginId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return String.format(
        "Owner[id=%s, teamName='%s', ownerName='%s']",
        id, teamName, ownerName);
    }

}
