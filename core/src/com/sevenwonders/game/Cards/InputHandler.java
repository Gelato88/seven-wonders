package com.sevenwonders.game.Cards;

import com.badlogic.gdx.Gdx;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;


public class InputHandler {

    SevenWonders game;

    public InputHandler(SevenWonders game) {
        this.game = game;
    }

    public void update() {

        float mouseX = (Gdx.input.getX()) * (Settings.RESOLUTION.x / Gdx.graphics.getWidth());
        float mouseY = (Gdx.graphics.getHeight() - Gdx.input.getY()) * (Settings.RESOLUTION.y / Gdx.graphics.getHeight());

        if(!game.currentPlayer.cardSelected) {
            for (Card c : game.currentPlayer.hand) {
                if (cardHover(c, mouseX, mouseY)) {
                    c.getSprite().setScale(1.1f);
                    if (Gdx.input.isTouched()) {
                        game.currentPlayer.selectCard(c);
                    }
                } else {
                    c.getSprite().setScale(1f);
                }
            }
        } else {
            if(cardHover(game.currentPlayer.selectedCard, mouseX, mouseY)) {
                if(Gdx.input.isTouched()) {
                    game.currentPlayer.deselectCard();
                }
            }
        }
    }

    private boolean cardHover(Card c, float mouseX, float mouseY) {
        float cardLeft = c.getSprite().getX();
        float cardRight = c.getSprite().getX() + c.getSprite().getWidth();
        float cardBot = c.getSprite().getY();
        float cardTop = c.getSprite().getY() + c.getSprite().getHeight();
        return mouseX >= cardLeft && mouseX <= cardRight && mouseY >= cardBot && mouseY <= cardTop;
    }


}
