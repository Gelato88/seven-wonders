package com.sevenwonders.game;

import java.util.ArrayList;

public class MilitaryManager {

    public ArrayList militaryAttack(ArrayList<Player> players) {
        int currentAge = Settings.currentAge;
        ArrayList<Player> _players = players;
        for (int p = 0; p < _players.size() - 1; p++) {
            Player playerOne = _players.get(p);
            Player playerTwo;
            if (p == 0) {
                playerTwo = _players.get(_players.size() - 1);
            } else {
                playerTwo = _players.get(p - 1);
            }
            Player battleWinner = findGreaterPlayerScore(playerOne, playerTwo);
            if (battleWinner != null) {
                for (int i = 0; i < _players.size() - 1; i++) {
                    if (battleWinner == _players.get(i)) {
                        if (currentAge == 1) {
                            _players.get(i).militaryWinsOne++;
                        } else if (currentAge == 2) {
                            _players.get(i).militaryWinsThree++;
                        } else if (currentAge == 3) {
                            _players.get(i).militaryWinsFive++;
                        }
                    }
                    System.out.println("Player " + i + " had the bigger military in age " + currentAge + " and beat Player " + p);
                }
            } else {
                int lp;
                if (p == 0) {
                    lp = _players.size() - 1;
                } else {
                    lp = p - 1;
                }
                System.out.println("Player " + p + " and Player " + lp + " had even military strengths and drew the battle.");
            }
        }
        return _players;
    }

    private Player findGreaterPlayerScore(Player playerOne, Player playerTwo) {
        if (playerOne.militaryShields > playerTwo.militaryShields) {
            return playerOne;
        } else if (playerOne.militaryShields < playerTwo.militaryShields) {
            return playerTwo;
        } else {
            return null;
        }
    }
}
