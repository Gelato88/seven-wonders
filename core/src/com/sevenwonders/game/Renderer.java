package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sevenwonders.game.Cards.Card;

import java.util.ArrayList;

public class Renderer {

    private SpriteBatch batch;
    private SevenWonders game;
    private GlyphLayout layout;
    private BitmapFont font;

    Texture img;
    Texture topBarBackground;
    Sprite img2;

    Renderer(SpriteBatch batch, SevenWonders game) {
        this.batch = batch;
        this.game = game;
        topBarBackground = new Texture(Gdx.files.internal("textures/TopBarBackground.png"));
        img2 = new Sprite(topBarBackground);
        img2.setPosition(0, 880);
    }

    private void drawCurrentPlayerHand() {
        float xIncrement = 200f;
        ArrayList<Card> hand = game.currentPlayer.hand;
        float xPos = (Settings.RESOLUTION.x/2) - ((hand.size()/2f) * xIncrement - 20f);
        batch.begin();
        for(Card c : hand) {
            if(!c.equals(game.currentPlayer.selectedCard)) {
                Sprite s = c.getSprite();
                s.setPosition(xPos, 30f);
                s.draw(batch);
            }
            xPos += xIncrement;
        }
        batch.end();
    }

    private void drawSelectedCard() {
        if(game.currentPlayer.cardSelected) {
            batch.begin();
            Sprite s = game.currentPlayer.selectedCard.getSprite();
            s.setPosition(Settings.RESOLUTION.x / 2 - s.getWidth() / 2, 400f);
            s.setScale(1.5f);
            s.draw(batch);
            batch.end();
        }
    }

    public void draw() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        img2.draw(batch);
        batch.end();
        drawCurrentPlayerHand();
        drawSelectedCard();
    }

}
