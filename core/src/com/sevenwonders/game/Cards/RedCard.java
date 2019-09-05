package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class RedCard extends Card {

    RedCard(RedCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        super.play(p);
        RedCardInfo redInfo = (RedCardInfo)info;
        p.militaryShields += redInfo.military;
    }

}
