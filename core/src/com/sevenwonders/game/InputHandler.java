package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.sevenwonders.game.Cards.Card;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;


public class InputHandler {

    public SevenWonders game;


    public InputHandler(SevenWonders game) {
        this.game = game;

    }

    public void update() {

        float mouseX = (Gdx.input.getX()) * (Settings.RESOLUTION.x / Gdx.graphics.getWidth());
        float mouseY = (Gdx.graphics.getHeight() - Gdx.input.getY()) * (Settings.RESOLUTION.y / Gdx.graphics.getHeight());

        if(!game.currentPlayer.cardSelected) {
            for (Card c : game.currentPlayer.hand) {
                c.button.checkHover(mouseX, mouseY);
            }
        } else {
            SevenWonders.game.renderer.cancelButton.checkHover(mouseX, mouseY);
        }
    }
}
