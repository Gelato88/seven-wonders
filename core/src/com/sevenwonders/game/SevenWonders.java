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
		setNeighbors();

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

	public void setNeighbors() {
		for(int i = 0; i < players.size() - 1; i++) {
			players.get(i).setRightNeighbor(players.get(i+1));
		}
		players.get(players.size()-1).setRightNeighbor(players.get(0));
		for(int i = 1; i < players.size(); i++) {
			players.get(i).setLeftNeighbor(players.get(i-1));
		}
		players.get(0).setLeftNeighbor(players.get(players.size()-1));
	}

}
