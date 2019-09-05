package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class BlueCard extends Card {

    BlueCard(BlueCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        super.play(p);
        BlueCardInfo blueInfo = (BlueCardInfo)info;
        p.points += blueInfo.points;
    }
}
