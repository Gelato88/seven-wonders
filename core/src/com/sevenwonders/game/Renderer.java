package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.sevenwonders.game.Cards.Card;

import java.util.ArrayList;

public class Renderer {

    private SpriteBatch batch;
    private SevenWonders game;
    private GlyphLayout layout;
    private BitmapFont whiteFont;
    private BitmapFont brownFont;
    private BitmapFont grayFont;
    private BitmapFont yellowFont;

    Texture img;
    Texture topBarBackground;
    Sprite img2;

    Renderer(SpriteBatch batch, SevenWonders game) {
        this.batch = batch;
        this.game = game;
        layout = new GlyphLayout();
        topBarBackground = new Texture(Gdx.files.internal("textures/TopBarBackground.png"));
        img2 = new Sprite(topBarBackground);
        img2.setPosition(0, 880);
        loadFonts();
    }

    private void loadFonts() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/LuckiestGuy-Regular.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 48;
        parameter.color = new Color(184/255f, 77/255f, 28/255f, 1f);
        parameter.shadowColor = Color.BLACK;
        parameter.shadowOffsetX = 3;
        parameter.shadowOffsetY = 1;
        brownFont = generator.generateFont(parameter);
        parameter.color = new Color(160/255f, 180/255f, 184/255f, 1f);
        grayFont = generator.generateFont(parameter);
        parameter.color = new Color(224/255f, 215/255f, 36/255f, 1f);
        yellowFont = generator.generateFont(parameter);
        parameter.color = Color.WHITE;
        whiteFont = generator.generateFont(parameter);
        generator.dispose();
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

    private void drawCurrentPlayerResources() {
        Player p = game.currentPlayer;
        float increment = 60f;

        batch.begin();
        writeResourceLine("" + p.coins, whiteFont, yellowFont, 80f, 1000f);
        writeResourceLine("" + p.lumber, whiteFont, brownFont, 80f, 1000f - increment * 1);
        writeResourceLine("" + p.ore, whiteFont, brownFont, 80f, 1000f - increment * 2);
        writeResourceLine("" + p.clay, whiteFont, brownFont, 80f, 1000f - increment * 3);
        writeResourceLine("" + p.stone, whiteFont, brownFont, 80f, 1000f - increment * 4);
        writeResourceLine("" + p.textile, whiteFont, grayFont, 80f, 1000f - increment * 5);
        writeResourceLine("" + p.glass, whiteFont, grayFont, 80f, 1000f - increment * 6);
        writeResourceLine("" + p.papyrus, whiteFont, grayFont, 80f, 1000f - increment * 7);
        batch.end();
    }

    private void writeResourceLine(String text, BitmapFont whiteFont, BitmapFont font, float x, float y) {
        layout.setText(whiteFont, " - ");
        float incrememnt = layout.width;
        whiteFont.draw(batch, layout, x, y);
        layout.setText(font, text);
        font.draw(batch, layout, x + incrememnt, y);
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
        drawCurrentPlayerResources();



    }

}
