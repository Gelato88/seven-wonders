package com.sevenwonders.game.Cards;

public class BrownCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int lumber;
    protected int ore;
    protected int clay;
    protected int stone;

    BrownCardInfo(int id, int age, String name, String texture, int lumber, int ore, int clay, int stone, int coinCost,
                  int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
                  int papyrusCost) {
        super(coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.lumber = lumber;
        this.ore = ore;
        this.clay = clay;
        this.stone = stone;
    }
}
