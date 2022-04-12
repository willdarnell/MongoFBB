package MongoFBB.demo.Entities;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Team {



    @Id
    public String id;

    public String teamName;
    public String ownerName;
    public List<Object> roster;
    public int draftBudget;
    public int waiverBudget;

    public Team() {}

    public Team(String teamName, String ownerName) {
        this.teamName = teamName;
        this.ownerName = ownerName;
        this.draftBudget = 1000;
        this.waiverBudget = 100;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Object> getRoster() {
        return roster;
    }

    public void setRoster(List<Object> roster) {
        this.roster = roster;
    }

    public int getDraftBudget() {
        return draftBudget;
    }

    public void setDraftBudget(int draftBudget) {
        this.draftBudget = draftBudget;
    }

    public int getWaiverBudget() {
        return waiverBudget;
    }

    public void setWaiverBudget(int waiverBudget) {
        this.waiverBudget = waiverBudget;
    }

    @Override
    public String toString() {
        return String.format(
                "Team[id=%s, teamName='%s', ownerName='%s']",
                id, teamName, ownerName);
    }
}
