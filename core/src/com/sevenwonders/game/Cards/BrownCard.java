package com.sevenwonders.game.Cards;

import com.sevenwonders.game.Player;

public class BrownCard extends Card {

    BrownCard(BrownCardInfo info) {
        super(info);
    }

    @Override
    public void play(Player p) {
        BrownCardInfo brownInfo = (BrownCardInfo)info;
        p.lumber += brownInfo.lumber;
        p.ore += brownInfo.ore;
        p.clay += brownInfo.clay;
        p.stone += brownInfo.clay;
    }

}
