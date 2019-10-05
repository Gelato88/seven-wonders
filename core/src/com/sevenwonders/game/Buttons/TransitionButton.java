package com.sevenwonders.game.Buttons;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;

public class TransitionButton extends Button {

    public TransitionButton(Sprite sprite) {
        super(sprite, Settings.RESOLUTION.x/2 - sprite.getWidth()/2, Settings.RESOLUTION.y/2 - sprite.getHeight()/2);
    }

    @Override
    public void click() {
        SevenWonders.game.currentScreen = "currentPlayerBoard";
    }
}
