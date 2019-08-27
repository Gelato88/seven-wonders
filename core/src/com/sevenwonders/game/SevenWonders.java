package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sevenwonders.game.Cards.CardFactory;

public class SevenWonders extends ApplicationAdapter {

	private SpriteBatch batch;
	private Renderer renderer;

	@Override
	public void create () {
		batch = new SpriteBatch();
		renderer = new Renderer(batch);
		CardFactory cardFactory = new CardFactory("json/cards.json");
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
