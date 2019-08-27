package com.sevenwonders.game.Cards;

public class PurpleCardInfo extends CardInfo {

    protected int id;
    protected int age;
    protected String name;
    protected String texture;
    protected int pointsPerSideBrown;
    protected int pointsPerSideGray;
    protected int pointsPerSideYellow;
    protected int pointsPerSideBlue;
    protected int pointsPerSideWonderStage;
    protected int pointsPerSideGreen;
    protected int pointsPerSideRed;
    protected int pointsPerSideLoss;
    protected int pointsPerBrown;
    protected int pointsPerGray;
    protected int pointsPerPurple;
    protected int pointsPerWonderStage;
    protected int chooseGreen;

    PurpleCardInfo(int id, int age, String name, String texture, int pointsPerSideBrown, int pointsPerSideGray,
                   int pointsPerSideYellow, int pointsPerSideBlue, int pointsPerSideWonderStage, int pointsPerSideGreen,
                   int pointsPerSideRed, int pointsPerSideLoss, int pointsPerBrown, int pointsPerGray,
                   int pointsPerPurple, int pointsPerWonderStage, int chooseGreen, int coinCost, int lumberCost,
                   int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
        super(coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.pointsPerSideBrown = pointsPerSideBrown;
        this.pointsPerSideGray = pointsPerSideGray;
        this.pointsPerSideYellow = pointsPerSideYellow;
        this.pointsPerSideBlue = pointsPerSideBlue;
        this.pointsPerSideWonderStage = pointsPerSideWonderStage;
        this.pointsPerSideGreen = pointsPerSideGreen;
        this.pointsPerSideRed = pointsPerSideRed;
        this.pointsPerSideLoss = pointsPerSideLoss;
        this.pointsPerBrown = pointsPerBrown;
        this.pointsPerGray = pointsPerGray;
        this.pointsPerPurple = pointsPerPurple;
        this.pointsPerWonderStage = pointsPerWonderStage;
        this.chooseGreen = chooseGreen;
    }
}
