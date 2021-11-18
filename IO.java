package com.company;

import java.util.ArrayList;

public interface IO {
    String[] readTeams();
    void saveGameData(ArrayList<team> teams);
    ArrayList<team> readTeams();
}