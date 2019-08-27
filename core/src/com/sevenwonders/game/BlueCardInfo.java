package com.sevenwonders.game;

public class BlueCardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int points;

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    BlueCardInfo(int id, int age, String name, String texture, int points, int coinCost, int lumberCost, int oreCost,
                 int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.points = points;

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
