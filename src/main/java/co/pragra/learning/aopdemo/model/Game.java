package co.pragra.learning.aopdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Game {
    private Team homeTeam;
    private Team awayTeam;

    public Game(@Qualifier("blueTeam") Team homeTeam, @Qualifier("redTeam") Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getWinner(){
        return Math.random()>0.5?homeTeam:awayTeam;
    }

    public void doSomething(String name, String className, double score){
        System.out.println("Method Executing");

        System.out.println("Method done");
    }
}
