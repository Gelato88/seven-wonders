package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.sevenwonders.game.Cards.Card;

import java.util.ArrayList;

public class Player {

    private static int playersLoaded = 0;
    private int playerNumber;

    public int coins;
    public int lumber;
    public int ore;
    public int clay;
    public int stone;
    public int textile;
    public int glass;
    public int papyrus;
    public int chooseBrown;
    public int chooseGray;
    public int leftBrownDiscount;
    public int rightBrownDiscount;
    public int leftGrayDiscount;
    public int rightGrayDiscount;
    public int pointsPerWonderStage;
    public int pointsPerBrown;
    public int pointsPerGray;
    public int pointsPerYellow;
    public int pointsPerPurple;
    public int pointsPerSideWonderStage;
    public int pointsPerSideBrown;
    public int pointsPerSideGray;
    public int pointsPerSideYellow;
    public int pointsPerSideBlue;
    public int pointsPerSideLoss;
    public int militaryShields;
    public int militaryWinsOne;
    public int militaryWinsThree;
    public int militaryWinsFive;
    public int militaryLosses;
    public int compass;
    public int gear;
    public int tablet;
    public int chooseGreen;

    public ArrayList<Card> hand;
    public ArrayList<Card> played;
    public Player leftNeighbor;
    public Player rightNeighbor;
    public Card selectedCard;
    public boolean cardSelected;

    public Player() {
        coins = Settings.startingGold;
        lumber = 0;
        ore = 0;
        clay = 0;
        stone = 0;
        textile = 0;
        glass = 0;
        papyrus = 0;
        chooseBrown = 0;
        chooseGray = 0;
        leftBrownDiscount = 0;
        rightBrownDiscount = 0;
        leftGrayDiscount = 0;
        rightGrayDiscount = 0;
        pointsPerWonderStage = 0;
        pointsPerBrown = 0;
        pointsPerGray = 0;
        pointsPerYellow = 0;
        pointsPerPurple = 0;
        pointsPerSideWonderStage = 0;
        pointsPerSideBrown = 0;
        pointsPerSideGray = 0;
        pointsPerSideYellow = 0;
        pointsPerSideBlue = 0;
        pointsPerSideLoss = 0;
        militaryShields = 0;
        militaryWinsOne = 0;
        militaryWinsThree = 0;
        militaryWinsFive = 0;
        militaryLosses = 0;
        compass = 0;
        gear = 0;
        tablet = 0;
        chooseGreen = 0;

        hand = new ArrayList<Card>();
        played = new ArrayList<Card>();
        cardSelected = false;

        playerNumber = ++playersLoaded;
        Gdx.app.log("Player", "Loaded player " + playersLoaded + ".");
    }

    public int canAfford(Card card) {
        return card.canAfford(this);
    }

    public void setLeftNeighbor(Player p) {
        leftNeighbor = p;
    }

    public void setRightNeighbor(Player p) {
        rightNeighbor = p;
    }

    public void selectCard(Card c) {
        selectedCard = c;
        cardSelected = true;
    }

    public void deselectCard() {
        selectedCard = null;
        cardSelected = false;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public void printHand() {
        System.out.println("Player " + playerNumber + ": ");
        for(Card c : hand) {
            c.printCardName();
        }
        System.out.println();
    }

    public int calculatePoints() {

        int score = 0;
        score = score + calculateSciencePoints();

        return score;
    }

    public int calculateSciencePoints() {
        int totalScienceScore = 0;
        //First square each type
        totalScienceScore = totalScienceScore + (int)Math.pow(compass, 2);
        totalScienceScore = totalScienceScore + (int)Math.pow(gear, 2);
        totalScienceScore = totalScienceScore + (int)Math.pow(tablet, 2);

        //Give 7 points per set of 3
        if (tablet <= gear && tablet <= compass) {
            totalScienceScore = totalScienceScore + (tablet * 7);
        } else if (gear <= tablet && gear <= compass) {
            totalScienceScore = totalScienceScore + (gear * 7);
        } else if (compass <= tablet && compass <= gear) {
            totalScienceScore = totalScienceScore + (compass * 7);
        }

        return totalScienceScore;
    }

}
