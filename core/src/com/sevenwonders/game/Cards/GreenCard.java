package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class GreenCard extends Card {

    GreenCard(GreenCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        GreenCardInfo greenInfo = (GreenCardInfo)info;
        p.compass += greenInfo.compass;
        p.gear += greenInfo.gear;
        p.tablet += greenInfo.tablet;
    }
}
