package com.sevenwonders.game.Buttons;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;

public class ConfirmButton extends Button {

    public ConfirmButton(Sprite sprite) {
        super(sprite, Settings.RESOLUTION.x/2 + 50f, Settings.RESOLUTION.y/2 - sprite.getHeight() - 10f);
    }

    @Override
    public void click() {
        SevenWonders.game.currentPlayer.buy(SevenWonders.game.currentPlayer.selectedCard);
        SevenWonders.game.nextTurn();
        SevenWonders.game.currentScreen = "transition";
    }

}
