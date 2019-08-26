package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SevenWonders extends ApplicationAdapter {

	private SpriteBatch batch;
	private Renderer renderer;

	@Override
	public void create () {
		Gdx.app.log("SevenWonders", "Hello, World!");
		batch = new SpriteBatch();
		renderer = new Renderer(batch);
	}

	@Override
	public void render () {
		renderer.draw();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
