package com.sevenwonders.game.Cards;

public class RedCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int military;

    RedCardInfo(int id, int age, String name, String texture, int military, int coinCost, int lumberCost, int oreCost,
                int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
        super(coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.military = military;
    }
}
