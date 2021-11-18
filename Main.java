package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Team> firstRoundMatchup = new ArrayList<Team>();
        loadTeams(firstRoundMatchup);

        System.out.println("The first round matchups are: ");
        System.out.println("______________________________");

        ArrayList<Team> secondRoundMatchup = processBracket(firstRoundMatchup);

        System.out.println("The second round matchups are: ");
        System.out.println("______________________________");

        ArrayList<Team> thirdRoundMatchup = processBracket(secondRoundMatchup);

        System.out.println("The third round matchups are: ");
        System.out.println("______________________________");

        ArrayList<Team> tournamentWinner = processBracket(thirdRoundMatchup);

        System.out.println("Winner of tournament is " + tournamentWinner.get(0).toString());
    }


    }

