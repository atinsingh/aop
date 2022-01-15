package co.pragra.learning.aopdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlueTeam implements Team{
    @Value("${team.blueTeam.name}")
    private String teamName;

    @Override
    public String getTeam() {
        return teamName;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
