package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Renderer {

    private SpriteBatch batch;
    private GlyphLayout layout;
    private BitmapFont font;

    Texture img;
    Texture topBarBackground;
    Sprite img2;

    Renderer(SpriteBatch batch) {

        this.batch = batch;
        topBarBackground = new Texture(Gdx.files.internal("textures/TopBarBackground.png"));
        img2 = new Sprite(topBarBackground);
        img2.setPosition(0, 880);
    }

    public void draw() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        img2.draw(batch);
        batch.end();

    }

}
