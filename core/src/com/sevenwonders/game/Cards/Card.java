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

    public int canAfford(Player p) { //does not test for choosing brown/gray from marketplace or caravansery
        if(p.lumber >= info.lumberCost && p.ore >= info.oreCost && p.clay >= info.clayCost && p.stone >= info.stoneCost
                && p.textile >= info.textileCost && p.glass >= info.glassCost && p.papyrus >= info.papyrusCost &&
                p.coins >= info.coinCost) {
            return 1;
        }
        for(Card c : p.played) {
            if (c.info.name.equals(info.freeCard)) {
                return 1;
            }
        }
        if(p.lumber + p.leftNeighbor.lumber + p.rightNeighbor.lumber >= info.lumberCost && p.ore + p.leftNeighbor.ore
                + p.rightNeighbor.ore >= info.oreCost && p.clay + p.rightNeighbor.clay + p.leftNeighbor.clay >=
                info.clayCost && p.stone + p.leftNeighbor.stone + p.rightNeighbor.stone >= info.stoneCost &&
                p.textile + p.leftNeighbor.textile + p.rightNeighbor.textile >= info.textileCost && p.glass +
                p.leftNeighbor.glass + p.rightNeighbor.glass >= info.glassCost && p.papyrus + p.leftNeighbor.papyrus +
                p.rightNeighbor.papyrus >= info.papyrusCost && p.coins >= info.coinCost) {
            int resourcesToBuy = (info.lumberCost - p.lumber) + (info.oreCost - p.ore) + (info.clayCost - p.clay) +
                    (info.stoneCost - p.stone) + (info.textileCost - p.textile) + (info.glassCost - p.glass) +
                    (info.papyrusCost - p.papyrus);
            if(p.coins / 2 - info.coinCost >= resourcesToBuy) {
                return 2;
            }
        }
        return 0;
    }

    public void printCardName() {
        System.out.println(info.name);
    }

}
