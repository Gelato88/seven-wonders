package com.sevenwonders.game;

public class GreenCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int compass;
    protected int gear;
    protected int tablet;

    GreenCardInfo(int id, int age, String name, String texture, int compass, int gear, int tablet, int coinCost,
                  int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                  int papyrusCost) {
        super(coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.compass = compass;
        this.gear = gear;
        this.tablet = tablet;
    }
}
