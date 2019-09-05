package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class GrayCard extends Card {

    GrayCard(GrayCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        GrayCardInfo grayInfo = (GrayCardInfo)info;
        p.textile += grayInfo.textile;
        p.glass += grayInfo.glass;
        p.papyrus += grayInfo.papyrus;
    }

}
