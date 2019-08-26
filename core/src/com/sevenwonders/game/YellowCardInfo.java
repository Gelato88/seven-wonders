package com.sevenwonders.game;

public class YellowCardInfo {

    private int id;
    private int age;
    private String name;
    private String texture;
    private int leftBrownDiscount;
    private int rightBrownDiscount;
    private int grayDiscount;
    private int coins;
    private int chooseBrown;
    private int chooseGray;
    private int coinsPerSideBrown;
    private int coinsPerBrown;
    private int coinsPerSideGray;
    private int coinsPerGray;
    private int coinsPerWonderStage;
    private int coinsPerYellow;
    private int pointsPerWonderStage;
    private int pointsPerYellow;
    private int pointsPerBrown;
    private int pointsPerGray;

    YellowCardInfo(int id, int age, String name, String texture, int leftBrownDiscount, int rightBrownDiscount,
                   int grayDiscount, int coins, int chooseBrown, int chooseGray, int coinsPerSideBrown,
                   int coinsPerBrown, int coinsPerSideGray, int coinsPerGray, int coinsPerWonderStage,
                   int coinsPerYellow, int pointsPerWonderStage, int pointsPerYellow, int pointsPerBrown,
                   int pointsPerGray) {
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
    }
}
