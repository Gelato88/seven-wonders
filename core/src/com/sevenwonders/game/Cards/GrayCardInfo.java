package com.sevenwonders.game.Cards;

public class GrayCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected int textile;
    protected int glass;
    protected int papyrus;

    GrayCardInfo(int id, int age, String name, String texture, int textile, int glass, int papyrus, int coinCost,
                 int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                 int papyrusCost) {
        super(name, texture, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.textile = textile;
        this.glass = glass;
        this.papyrus = papyrus;
    }
}
