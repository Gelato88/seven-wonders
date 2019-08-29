package com.sevenwonders.game.Cards;


import com.badlogic.gdx.graphics.g2d.Sprite;

public class Card {

    private CardInfo info;

    Card(CardInfo info) {
        this.info = info;
    }

    public Sprite getSprite() {
        return info.sprite;
    }

    public void printCardName() {
        System.out.println(info.name);
    }

}
