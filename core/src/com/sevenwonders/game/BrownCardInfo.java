package com.sevenwonders.game;

public class BrownCardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int lumber;
    protected int ore;
    protected int clay;
    protected int stone;

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    BrownCardInfo(int id, int age, String name, String texture, int lumber, int ore, int clay, int stone, int coinCost,
                  int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                  int papyrusCost) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.lumber = lumber;
        this.ore = ore;
        this.clay = clay;
        this.stone = stone;

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
