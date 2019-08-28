package com.sevenwonders.game.Cards;

public class BlueCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected int points;

    BlueCardInfo(int id, int age, String name, String texture, int points, int coinCost, int lumberCost, int oreCost,
                 int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
        super(name, texture, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.points = points;
    }
}
