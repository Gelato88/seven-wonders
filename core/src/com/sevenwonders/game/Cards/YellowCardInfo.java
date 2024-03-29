package com.sevenwonders.game.Cards;

public class YellowCardInfo extends CardInfo {

    protected int id;
    protected int age;
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
    protected int coinsPerSideWonderStage;
    protected int coinsPerWonderStage;
    protected int coinsPerYellow;
    protected int pointsPerWonderStage;
    protected int pointsPerSideWonderStage;
    protected int pointsPerYellow;
    protected int pointsPerBrown;
    protected int pointsPerGray;

    YellowCardInfo(int id, int age, String name, String texture, int leftBrownDiscount, int rightBrownDiscount,
                   int grayDiscount, int coins, int chooseBrown, int chooseGray, int coinsPerSideBrown,
                   int coinsPerBrown, int coinsPerSideGray, int coinsPerGray, int coinsPerSideWonderStage, int coinsPerWonderStage,
                   int coinsPerYellow, int pointsPerWonderStage, int pointsPerSideWonderStage, int pointsPerYellow, int pointsPerBrown,
                   int pointsPerGray, int coinCost, int lumberCost, int oreCost, int clayCost, int stoneCost,
                   int textileCost, int glassCost, int papyrusCost, String freeCard) {
        super(name, texture, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost,papyrusCost, freeCard);
        this.id = id;
        this.age = age;
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
        this.coinsPerSideWonderStage = coinsPerSideWonderStage;
        this.coinsPerWonderStage = coinsPerWonderStage;
        this.coinsPerYellow = coinsPerYellow;
        this.pointsPerWonderStage = pointsPerWonderStage;
        this.pointsPerSideWonderStage = pointsPerSideWonderStage;
        this.pointsPerYellow = pointsPerYellow;
        this.pointsPerBrown = pointsPerBrown;
        this.pointsPerGray = pointsPerGray;
    }
}
