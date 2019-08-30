package com.sevenwonders.game.Cards;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.sevenwonders.game.Player;

public class Card {

    public CardInfo info;

    Card(CardInfo info) {
        this.info = info;
    }

    public Sprite getSprite() {
        return info.sprite;
    }

    public boolean canAfford(Player p) {
        if(p.lumber >= info.lumberCost && p.ore >= info.oreCost && p.clay >= info.clayCost && p.stone >= info.stoneCost
                && p.textile >= info.textileCost && p.glass >= info.glassCost && p.papyrus >= info.papyrusCost) {
            return true;
        }
        for(Card c : p.played) {
            if (c.info.name.equals(info.name)) {
                return true;
            }
        }
        return false;
    }

    public void printCardName() {
        System.out.println(info.name);
    }

}
