package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class PurpleCard extends Card {

    PurpleCard(PurpleCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        super.play(p);
        PurpleCardInfo purpleInfo = (PurpleCardInfo)info;
        p.pointsPerSideBrown += purpleInfo.pointsPerSideBrown;
        p.pointsPerSideGray += purpleInfo.pointsPerSideGray;
        p.pointsPerSideYellow += purpleInfo.pointsPerSideYellow;
        p.pointsPerSideBlue += purpleInfo.pointsPerSideBlue;
        p.pointsPerSideWonderStage += purpleInfo.pointsPerSideWonderStage;
        p.pointsPerSideGreen += purpleInfo.pointsPerSideGreen;
        p.pointsPerSideRed += purpleInfo.pointsPerSideRed;
        p.pointsPerSideLoss += purpleInfo.pointsPerSideLoss;
        p.pointsPerBrown += purpleInfo.pointsPerBrown;
        p.pointsPerGray += purpleInfo.pointsPerGray;
        p.pointsPerPurple += purpleInfo.pointsPerPurple;
        p.pointsPerWonderStage += purpleInfo.pointsPerWonderStage;
        p.chooseGreen += purpleInfo.chooseGreen;
    }

}
