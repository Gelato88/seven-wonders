package com.sevenwonders.game.Cards;

public class Card {

    private CardInfo info;

    Card(CardInfo info) {
        this.info = info;
    }

    public void printCardName() {
        System.out.println(info.name);
    }

}
