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
    Sprite img2;

    Renderer(SpriteBatch batch) {

        this.batch = batch;
        img = new Texture(Gdx.files.internal("kneeboi2.png"));
        img2 = new Sprite(img);
        img2.setSize(Settings.RESOLUTION.x, Settings.RESOLUTION.y);
    }

    public void draw() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        img2.draw(batch);
        batch.end();

    }

}
