package org.vashonsd;

import java.util.Random;

public class SoccerBot {
    int jerseyNumber;
    String playerName;


    public SoccerBot() {
        Random r = new Random();
        jerseyNumber = r.nextInt(14) + 1;
        playerName= "Ronaldo";
    }

    public SoccerBot(int nbr, String name) {
        jerseyNumber=nbr;
        playerName = name;
    }

    @Override
    public String toString() {
        return "SoccerBot{" +
                "jerseyNumber=" + jerseyNumber +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
