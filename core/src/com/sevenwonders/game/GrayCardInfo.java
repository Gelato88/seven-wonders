package com.sevenwonders.game;

public class GrayCardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int textile;
    protected int glass;
    protected int papyrus;

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    GrayCardInfo(int id, int age, String name, String texture, int textile, int glass, int papyrus, int coinCost,
                 int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                 int papyrusCost) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.textile = textile;
        this.glass = glass;
        this.papyrus = papyrus;

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
