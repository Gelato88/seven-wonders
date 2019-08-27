package com.sevenwonders.game;

public class PurpleCardInfo {

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

    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;

    PurpleCardInfo(int id, int age, String name, String texture, int pointsPerSideBrown, int pointsPerSideGray,
                   int pointsPerSideYellow, int pointsPerSideBlue, int pointsPerSideWonderStage, int pointsPerSideGreen,
                   int pointsPerSideRed, int pointsPerSideLoss, int pointsPerBrown, int pointsPerGray,
                   int pointsPerPurple, int pointsPerWonderStage, int chooseGreen, int coinCost, int lumberCost,
                   int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost, int papyrusCost) {
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
