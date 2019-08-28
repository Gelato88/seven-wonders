package com.sevenwonders.game.Cards;

public class CardInfo {

    protected String name;
    protected String texture;
    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    CardInfo(String name, String texture, int coinCost, int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
             int papyrusCost) {
        this.name = name;
        this.texture = texture;
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
