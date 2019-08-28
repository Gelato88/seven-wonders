package com.sevenwonders.game.Cards;

public class GreenCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected int compass;
    protected int gear;
    protected int tablet;

    GreenCardInfo(int id, int age, String name, String texture, int compass, int gear, int tablet, int coinCost,
                  int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                  int papyrusCost) {
        super(name, texture, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.compass = compass;
        this.gear = gear;
        this.tablet = tablet;
    }
}
