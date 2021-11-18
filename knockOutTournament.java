package com.company;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public abstract class knockOutTournament{
    public Team(String name){
        this.name=name;

    }
    @Override
    public String toString(){
        return name;
    }
    private String name;

    private static Team pickWinner(team1, team2){
        RandomGenerator randomGenerator = new RandomGenerator();
        ArrayList<Team> thisGame = new ArrayList<Team>();
        thisGame.add(team1);
        thisGame.add(team2);

        List<Team> winner = randomGenerator.randomize(thisGame, 1, true);

        System.out.println("winner of " + team1.toString() + " vs " + team2.toString() + "is" + winner.get(0).getName());
        return winner.get(0);

        }

        public abstract List<T> randomize(List<T> tlist);

    private static ArrayList<Team> processBracket(ArrayList<Team> thisRound) {
        ArrayList<Team> returnBracket = new ArrayList<Team>();

        int start = 0;
        int end = (thisRound.size() -1);

        while (start < end){
            Team Winnder = pickWinner(thisRound.get(start), thisRound.get(end));
            returnBracket.addWinner;

            start++;
            end--;
        } return returnBracket;
    }


}
