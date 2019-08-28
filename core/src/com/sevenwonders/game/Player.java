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
    public int military;
    public int militaryLosses;
    public int compass;
    public int gear;
    public int tablet;
    public int chooseGreen;

    public ArrayList<Card> hand;
    public ArrayList<Card> played;

    public Player() {
        coins = 3;
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
        military = 0;
        militaryLosses = 0;
        compass = 0;
        gear = 0;
        tablet = 0;
        chooseGreen = 0;

        hand = new ArrayList<Card>();
        played = new ArrayList<Card>();

        playerNumber = ++playersLoaded;
        Gdx.app.log("Player", "Loaded player " + playersLoaded + ".");
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

        return score;
    }

}
