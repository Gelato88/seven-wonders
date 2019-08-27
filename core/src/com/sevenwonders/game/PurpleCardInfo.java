package com.sevenwonders.game;

public class PurpleCardInfo {

    private int id;
    private int age;
    private String name;
    private String texture;
    private int pointsPerSideBrown;
    private int pointsPerSideGray;
    private int pointsPerSideYellow;
    private int pointsPerSideBlue;
    private int pointsPerSideWonderStage;
    private int pointsPerSideGreen;
    private int pointsPerSideRed;
    private int pointsPerSideLoss;
    private int pointsPerBrown;
    private int pointsPerGray;
    private int pointsPerPurple;
    private int pointsPerWonderStage;
    private int chooseGreen;

    PurpleCardInfo(int id, int age, String name, String texture, int pointsPerSideBrown, int pointsPerSideGray,
                   int pointsPerSideYellow, int pointsPerSideBlue, int pointsPerSideWonderStage, int pointsPerSideGreen,
                   int pointsPerSideRed, int pointsPerSideLoss, int pointsPerBrown, int pointsPerGray,
                   int pointsPerPurple, int pointsPerWonderStage, int chooseGreen) {
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
