package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.sevenwonders.game.Cards.CardFactory;

import java.util.ArrayList;

public class SevenWonders extends ApplicationAdapter {

	private SpriteBatch batch;
	private Renderer renderer;

	public ArrayList<Player> players;
	public Player currentPlayer;

	@Override
	public void create () {
		batch = new SpriteBatch();
		renderer = new Renderer(batch, this);
		players = new ArrayList<Player>();
		CardFactory cardFactory = new CardFactory("json/cards.json");
		DeckManager deckManager = new DeckManager("json/decks.json", cardFactory, this);

		for(int i = 0; i < Settings.players; i++) {
		    players.add(new Player());
        }
        System.out.println();

        deckManager.deal(1);
        currentPlayer = players.get(0);

		for(Player p : players) {
		    p.printHand();
        }
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
