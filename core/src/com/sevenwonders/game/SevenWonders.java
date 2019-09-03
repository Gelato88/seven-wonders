package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import com.sevenwonders.game.Cards.Card;
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

        Assets.load();

		for(int i = 0; i < Settings.players; i++) {
		    players.add(new Player());
        }
        System.out.println();
		setNeighbors();

        deckManager.deal(1);
        currentPlayer = players.get(0);

		//Testing military
		//Currently off since we don't need this yet
		//militaryManager.militaryAttack();
	}

	@Override
	public void render () {
	    inputHandler.update();
		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
			players = passHandToRightNeighbor();
		}
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

	private ArrayList<Player> passHandToRightNeighbor(){
		ArrayList<Player> tempPlayerList;
		tempPlayerList = players;
		//Pass all the cards except for the first player, who will loop around after
		for (int i = 1; i < players.size(); i++) {
			tempPlayerList.get(i - 1).hand = players.get(i).hand;
			int p = i - 1;
		}
		//Make sure to get the first player to take the last player's hand
		tempPlayerList.get(players.size()-1).hand = players.get(0).hand;
		return tempPlayerList;
	}

}
