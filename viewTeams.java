package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class viewTeams {
    private static ArrayList<String> teams;

    public static void main(String[] args) {

    }

    public void loadTeams()throws FileNotFoundException{
        {
            Scanner s = new Scanner(new File("C:\\Users\\william hansen\\Desktop\\teams.txt"));
            teams = new ArrayList<String>();

            while (s.hasNextLine()) {
                teams.add(s.nextLine());
            }
            System.out.println(teams);

        }

    }
    public static ArrayList<String> getTeams(){
        return teams;
    }

}


