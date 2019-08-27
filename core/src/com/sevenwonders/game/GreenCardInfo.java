package com.sevenwonders.game;

public class GreenCardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int compass;
    protected int gear;
    protected int tablet;

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    GreenCardInfo(int id, int age, String name, String texture, int compass, int gear, int tablet, int coinCost,
                  int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                  int papyrusCost) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.compass = compass;
        this.gear = gear;
        this.tablet = tablet;

        this.coinCost = coinCost;
        this.lumberCost = lumberCost;
        this.oreCost = oreCost;
        this.clayCost = clayCost;
        this.stoneCost = stoneCost;
        this.textileCost = textileCost;
        this.glassCost = glassCost;
        this.papyrusCost = papyrusCost;
    }
}
