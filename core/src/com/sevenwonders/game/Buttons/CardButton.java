package com.sevenwonders.game.Buttons;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.sevenwonders.game.Cards.Card;
import com.sevenwonders.game.SevenWonders;

public class CardButton extends Button {

    private static final float MIN_SCALE = 1.0f;
    private static final float MAX_SCALE = 1.1f;
    private static final float SCALE_SPEED = 0.02f;

    private Card card;

    public CardButton(Sprite sprite, Card card) {
        super(sprite, 0f, 0f);
        this.card = card;
    }

    @Override
    public void click() {
        SevenWonders.game.currentPlayer.selectCard(card);
    }

    @Override
    public void hovering() {
        super.hovering();
        float currentScale = sprite.getScaleX();
        if(currentScale < MAX_SCALE) {
            if(currentScale < MIN_SCALE) {
                sprite.setScale(MIN_SCALE);
            }
            sprite.setScale(currentScale + SCALE_SPEED);
        }
        if(sprite.getScaleX() > MAX_SCALE){
            sprite.setScale(MAX_SCALE);
        }
    }

    @Override
    public void notHovering() {
        float currentScale = sprite.getScaleX();
        if(currentScale > MIN_SCALE) {
            if(currentScale > MAX_SCALE) {
                sprite.setScale(MAX_SCALE);
            }
            sprite.setScale(currentScale - SCALE_SPEED);
        }
        if(sprite.getScaleX() < MIN_SCALE) {
            sprite.setScale(MIN_SCALE);
        }
    }
}


