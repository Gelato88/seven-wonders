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
import com.sevenwonders.game.Buttons.CancelButton;
import com.sevenwonders.game.Cards.Card;

import java.util.ArrayList;

public class Renderer {

    private SpriteBatch batch;
    private GlyphLayout layout;
    private BitmapFont whiteFont;
    private BitmapFont brownFont;
    private BitmapFont grayFont;
    private BitmapFont yellowFont;
    private BitmapFont buttonFont;

    public CancelButton cancelButton;

    Texture topBarBackground;
    Sprite topBarBackgroundSprite;

    Renderer(SpriteBatch batch) {
        this.batch = batch;
        layout = new GlyphLayout();
        topBarBackground = new Texture(Gdx.files.internal("textures/TopBarBackground.png"));
        topBarBackgroundSprite = new Sprite(topBarBackground);
        topBarBackgroundSprite.setPosition(0, 880);

        cancelButton = new CancelButton(Assets.cancelButton);

        loadFonts();
    }

    private void loadFonts() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/LuckiestGuy-Regular.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 48;
        parameter.shadowColor = Color.BLACK;
        parameter.shadowOffsetX = 3;
        parameter.shadowOffsetY = 1;
        parameter.color = new Color(97/255f, 41/255f, 17/255f, 1f);
        brownFont = generator.generateFont(parameter);
        parameter.color = new Color(160/255f, 180/255f, 184/255f, 1f);
        grayFont = generator.generateFont(parameter);
        parameter.color = new Color(224/255f, 215/255f, 36/255f, 1f);
        yellowFont = generator.generateFont(parameter);
        parameter.color = Color.WHITE;
        whiteFont = generator.generateFont(parameter);

        parameter.size = 32;
        parameter.shadowOffsetX = 0;
        parameter.shadowOffsetY = 0;
        parameter.borderColor = Color.BLACK;
        parameter.borderWidth = 2;
        parameter.color = Color.WHITE;
        generator.dispose();
    }

    private void drawCurrentPlayerHand() {
        float xIncrement = 200f;
        ArrayList<Card> hand = SevenWonders.game.currentPlayer.hand;
        float xPos = (Settings.RESOLUTION.x/2) - ((hand.size()/2f) * xIncrement - 20f);
        batch.begin();
        for(Card c : hand) {
            if(!c.equals(SevenWonders.game.currentPlayer.selectedCard)) {
                c.button.draw(batch, xPos, 60f);
            }
            xPos += xIncrement;
        }
        batch.end();
    }

    private void drawCurrentPlayerResources() {
        Player p = SevenWonders.game.currentPlayer;
        float yStart = 1020f;
        float increment = 75f;

        batch.begin();
        drawResourceLine(Assets.coins,"" + p.coins, whiteFont, yellowFont,  yStart);
        drawResourceLine(Assets.stones,"" + p.lumber, whiteFont, brownFont, yStart - increment * 1);
        drawResourceLine(Assets.stones,"" + p.ore, whiteFont, brownFont,  yStart - increment * 2);
        drawResourceLine(Assets.bricks,"" + p.clay, whiteFont, brownFont,  yStart - increment * 3);
        drawResourceLine(Assets.ore,"" + p.stone, whiteFont, brownFont,  yStart - increment * 4);
        drawResourceLine(Assets.stones,"" + p.textile, whiteFont, grayFont, yStart - increment * 5);
        drawResourceLine(Assets.stones,"" + p.glass, whiteFont, grayFont,  yStart - increment * 6);
        drawResourceLine(Assets.stones,"" + p.papyrus, whiteFont, grayFont, yStart - increment * 7);
        batch.end();
    }

    private void drawResourceLine(Sprite sprite, String text, BitmapFont whiteFont, BitmapFont font, float y) {
        sprite.setPosition(20f, y - sprite.getHeight());
        sprite.draw(batch);
        layout.setText(whiteFont, " - ");
        whiteFont.draw(batch, layout, 90f, y - layout.height/2);
        layout.setText(font, text);
        font.draw(batch, layout, 130f, y - layout.height/2);
    }

    private void drawSelectedCard() {
        if(SevenWonders.game.currentPlayer.cardSelected) {
            batch.begin();
            Sprite s = SevenWonders.game.currentPlayer.selectedCard.getSprite();
            s.setPosition(Settings.RESOLUTION.x/2 - s.getWidth(), 400f);
            s.setScale(1.5f);
            s.draw(batch);

            switch(SevenWonders.game.currentPlayer.canAfford(SevenWonders.game.currentPlayer.selectedCard)) {
                case 0: //cannot afford
                    //Assets.invalidButton.draw(batch);
                    break;
                case 1: //can afford
                    //Assets.confirmButton.draw(batch);
                    break;
                case 2: //must buy resources
                    //Assets.warningButton.draw(batch);
                    break;
            }

            cancelButton.draw(batch);

            batch.end();
        }
    }

    private void drawBackground() {
        Assets.resourceBacking.draw(batch);
    }

    public void draw() {
        Gdx.gl.glClearColor(255, 255, 255, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        drawBackground();
        batch.end();
        drawCurrentPlayerHand();
        drawSelectedCard();
        drawCurrentPlayerResources();

    }

}
