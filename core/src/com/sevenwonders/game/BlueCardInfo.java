package com.sevenwonders.game;

public class BlueCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int points;

    BlueCardInfo(int id, int age, String name, String texture, int points, int coinCost, int lumberCost, int oreCost,
                 int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
        super(coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.points = points;
    }
}
