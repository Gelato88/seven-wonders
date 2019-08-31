package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.sevenwonders.game.Cards.CardFactory;
import com.sevenwonders.game.Cards.InputHandler;

import java.util.ArrayList;

public class SevenWonders extends ApplicationAdapter {

	private SpriteBatch batch;
	private Renderer renderer;
	private CardFactory cardFactory;
	private DeckManager deckManager;
	private MilitaryManager militaryManager;
	private InputHandler inputHandler;

	public ArrayList<Player> players;
	public Player currentPlayer;

	@Override
	public void create () {
		batch = new SpriteBatch();
		renderer = new Renderer(batch, this);
		players = new ArrayList<Player>();
		cardFactory = new CardFactory("json/cards.json");
		deckManager = new DeckManager("json/decks.json", cardFactory, this);
		militaryManager = new MilitaryManager(players);
        inputHandler = new InputHandler(this);

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

		//Testing military
		players.get(0).militaryShields++;
		players.get(0).militaryShields++;
		players.get(1).militaryShields++;
		militaryManager.militaryAttack();
	}

	@Override
	public void render () {
	    inputHandler.update();
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
