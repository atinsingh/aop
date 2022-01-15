package co.pragra.learning.aopdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RedTeam implements Team {
    @Value("${team.redTeam.name}")
    private String teamName;

    @Override
    public String getTeam() {
        return teamName;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
