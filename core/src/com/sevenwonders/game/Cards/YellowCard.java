package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class YellowCard extends Card {

    YellowCard(YellowCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        YellowCardInfo yellowInfo = (YellowCardInfo)info;
        p.leftBrownDiscount += yellowInfo.leftBrownDiscount;
        p.rightBrownDiscount += yellowInfo.rightBrownDiscount;
        p.leftGrayDiscount += yellowInfo.grayDiscount;
        p.rightGrayDiscount += yellowInfo.grayDiscount;
        p.coins += yellowInfo.coins;
        p.chooseBrown += yellowInfo.chooseBrown;
        p.chooseGray += yellowInfo.chooseGray;
        p.coins += 0; //side browns
        p.coins += 0; //browns
        p.coins += 0; //side grays
        p.coins += 0; //grays
        p.coins += 0; //side wonder stages
        p.coins += 0; //wonder stages
        p.coins += 0; //yellows
        p.pointsPerWonderStage += yellowInfo.pointsPerWonderStage;
        p.pointsPerSideWonderStage += yellowInfo.pointsPerSideWonderStage;
        p.pointsPerYellow += yellowInfo.pointsPerYellow;
        p.pointsPerBrown += yellowInfo.pointsPerBrown;
        p.pointsPerGray += yellowInfo.pointsPerGray;
    }

}
