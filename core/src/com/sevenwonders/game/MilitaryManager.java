package com.sevenwonders.game;

import java.util.ArrayList;

public class MilitaryManager {

    ArrayList<Player> players;

    public MilitaryManager(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList militaryAttack() {
        int currentAge = Settings.currentAge;
        ArrayList<Player> _players = players;
        for (int p = 0; p < _players.size(); p++) {
            Player playerOne = _players.get(p);
            Player playerTwo;
            int lp;
            if (p == 0) {
                playerTwo = _players.get(_players.size() - 1);
                lp = _players.size() - 1;
            } else {
                playerTwo = _players.get(p - 1);
                lp = p - 1;
            }
            Player battleWinner = findGreaterPlayerScore(playerOne, playerTwo);
            if (battleWinner != null) {
                if (battleWinner == _players.get(p)) {
                    if (currentAge == 1) {
                        _players.get(p).militaryWinsOne++;
                    } else if (currentAge == 2) {
                        _players.get(p).militaryWinsThree++;
                    } else if (currentAge == 3) {
                        _players.get(p).militaryWinsFive++;
                    }
                    System.out.println("Player " + p + " had the bigger military in age " + currentAge + " and beat Player " + lp);
                } else {
                    _players.get(lp).militaryLosses++;
                    System.out.println("Player " + p + " had the smaller military in age " + currentAge + " and lost to Player " + lp);
                }
            } else {
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
