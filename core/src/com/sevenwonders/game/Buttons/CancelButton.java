package com.sevenwonders.game.Buttons;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;

public class CancelButton extends Button {

    public CancelButton(Sprite sprite) {
        super(sprite, (Settings.RESOLUTION.x/2 + 50f), (Settings.RESOLUTION.y/2 + 10f));
    }

    @Override
    public void click() {
        SevenWonders.game.currentPlayer.deselectCard();
    }

}
