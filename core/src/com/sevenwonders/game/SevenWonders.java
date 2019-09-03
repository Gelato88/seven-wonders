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
	public int age;

	@Override
	public void create () {
		batch = new SpriteBatch();
		renderer = new Renderer(batch, this);
		players = new ArrayList<Player>();
		cardFactory = new CardFactory("json/cards.json");
		deckManager = new DeckManager("json/decks.json", cardFactory, this);
		militaryManager = new MilitaryManager(players);
        inputHandler = new InputHandler(this);


        age = 1;
        Assets.load();

		for(int i = 0; i < Settings.players; i++) {
		    players.add(new Player());
        }
        System.out.println();
		setNeighbors();

        deckManager.deal(age);
        currentPlayer = players.get(0);

		//Testing military
		//Currently off since we don't need this yet
		//militaryManager.militaryAttack();
	}

	@Override
	public void render () {
	    inputHandler.update();
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
		    passHands(age);
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

    private void passHands(int age) {
	    if(age % 2 == 0) {
	        ArrayList<Card> temp = players.get(0).hand;
	        for(int i = 0; i < players.size()-1; i++) {
	            players.get(i).hand = players.get(i+1).hand;
            }
            players.get(players.size()-1).hand = temp;
        } else {
	        ArrayList<Card> temp = players.get(players.size()-1).hand;
	        for(int i = 0; i < players.size() - 1; i++) {
	            players.get(i+1).hand = players.get(i).hand;
            }
            players.get(0).hand = temp;
        }
    }
}
