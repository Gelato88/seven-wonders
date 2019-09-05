package com.sevenwonders.game.Buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public abstract class Button {

    protected Sprite sprite;
    protected Vector2 centerPosition;
    protected boolean active;

    public Button(Sprite sprite, float x, float y) {
        this.sprite = sprite;
        centerPosition = new Vector2(x + sprite.getWidth()/2, y + sprite.getHeight()/2);
        active = true;
        updatePosition();
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public void updatePosition() {
        sprite.setPosition(centerPosition.x - sprite.getWidth()/2, centerPosition.y - sprite.getHeight()/2);
    }

    public void setCenterPosition(float x, float y) {
        centerPosition.x = x;
        centerPosition.y = y;
        updatePosition();
    }

    public abstract void click();

    public void hovering() {
        if(Gdx.input.isTouched()) {
            click();
        }
    }

    public void notHovering() {

    }

    public void checkHover(float mouseX, float mouseY) {
        float left = sprite.getX();
        float right = sprite.getX() + sprite.getWidth();
        float bot = sprite.getY();
        float top = sprite.getY() + sprite.getHeight();
        if(mouseX >= left && mouseX <= right && mouseY >= bot && mouseY <= top) {
            hovering();
        } else {
            notHovering();
        }
    }

    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public void draw(SpriteBatch batch, float x, float y) {
        setCenterPosition(x + sprite.getWidth()/2, y + sprite.getHeight()/2);
        draw(batch);
    }

}
