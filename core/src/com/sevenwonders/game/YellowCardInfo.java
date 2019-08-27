package com.sevenwonders.game;

public class YellowCardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int leftBrownDiscount;
    protected int rightBrownDiscount;
    protected int grayDiscount;
    protected int coins;
    protected int chooseBrown;
    protected int chooseGray;
    protected int coinsPerSideBrown;
    protected int coinsPerBrown;
    protected int coinsPerSideGray;
    protected int coinsPerGray;
    protected int coinsPerWonderStage;
    protected int coinsPerYellow;
    protected int pointsPerWonderStage;
    protected int pointsPerYellow;
    protected int pointsPerBrown;
    protected int pointsPerGray;

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    YellowCardInfo(int id, int age, String name, String texture, int leftBrownDiscount, int rightBrownDiscount,
                   int grayDiscount, int coins, int chooseBrown, int chooseGray, int coinsPerSideBrown,
                   int coinsPerBrown, int coinsPerSideGray, int coinsPerGray, int coinsPerWonderStage,
                   int coinsPerYellow, int pointsPerWonderStage, int pointsPerYellow, int pointsPerBrown,
                   int pointsPerGray, int coinCost, int lumberCost, int oreCost, int clayCost, int stoneCost,
                   int textileCost, int glassCost, int papyrusCost) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.leftBrownDiscount = leftBrownDiscount;
        this.rightBrownDiscount = rightBrownDiscount;
        this.grayDiscount = grayDiscount;
        this.coins = coins;
        this.chooseBrown = chooseBrown;
        this.chooseGray = chooseGray;
        this.coinsPerSideBrown = coinsPerSideBrown;
        this.coinsPerBrown = coinsPerBrown;
        this.coinsPerSideGray = coinsPerSideGray;
        this.coinsPerGray = coinsPerGray;
        this.coinsPerWonderStage = coinsPerWonderStage;
        this.coinsPerYellow = coinsPerYellow;
        this.pointsPerWonderStage = pointsPerWonderStage;
        this.pointsPerYellow = pointsPerYellow;
        this.pointsPerBrown = pointsPerBrown;
        this.pointsPerGray = pointsPerGray;

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
