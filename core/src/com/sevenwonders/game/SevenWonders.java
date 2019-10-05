package com.sevenwonders.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import com.sevenwonders.game.Cards.Card;
import com.sevenwonders.game.Cards.CardFactory;

import java.util.ArrayList;

public class SevenWonders extends ApplicationAdapter {

    public static SevenWonders game;

    public SpriteBatch batch;
	public Renderer renderer;
    public CardFactory cardFactory;
    public WonderFactory wonderFactory;
    public DeckManager deckManager;
    public MilitaryManager militaryManager;
    public InputHandler inputHandler;

	public ArrayList<Player> players;
	public Player currentPlayer;
	public int age;
	public int turnsThisAge;
	public String currentScreen;

	@Override
	public void create () {
	    game = this;
		Assets.load();

		batch = new SpriteBatch();
		renderer = new Renderer(batch);
		players = new ArrayList<Player>();
		cardFactory = new CardFactory("json/cards.json");
		wonderFactory = new WonderFactory("json/wonders.json");
		deckManager = new DeckManager("json/decks.json", cardFactory);
		militaryManager = new MilitaryManager(players);
        inputHandler = new InputHandler(this);

        age = 1;
        turnsThisAge = 0;

		for(int i = 0; i < Settings.players; i++) {
		    players.add(new Player());
        }
        System.out.println();
		setNeighbors();

        deckManager.deal(age);
        currentPlayer = players.get(0);
        currentScreen = "transition";

		//Testing military
		//Currently off since we don't need this yet
		//militaryManager.militaryAttack(age);
	}

	@Override
	public void render () {
	    inputHandler.update();
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
		    passHands();
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

	public void nextTurn() {
	    if(players.indexOf(currentPlayer) < players.size()-1) {
	        currentPlayer = players.get(players.indexOf(currentPlayer)+1);
        } else {
	        currentPlayer = players.get(0);
	        turnsThisAge++;
	        passHands();
        }
        if(turnsThisAge >= Settings.turnsPerAge) {
            if(age < Settings.maxAges) {
                militaryManager.militaryAttack(age);
                age++;
                deckManager.deal(age);
            } else {
				endGame();
            }
        }
    }

    private void endGame() {
		boolean unfinished = true;
		ArrayList<Player> placement = new ArrayList<Player>();
		for(Player p : players) {
		    p.calculatePoints();
		    placement.add(p);
        }
        while(unfinished) {
            unfinished = false;
            for(int i = 0; i < placement.size()-1; i++) {
                if(placement.get(i).score < placement.get(i+1).score) {
                    unfinished = true;
                    Player temp = placement.get(i);
                    placement.set(i, placement.get(i+1));
                    placement.set(i+1, temp);
                }
            }
        }
	}

    private void passHands() {
	    if(age % 2 == 0) {
	        ArrayList<Card> temp = players.get(0).hand;
	        for(int i = 0; i < players.size()-1; i++) {
	            players.get(i).hand = players.get(i+1).hand;
            }
            players.get(players.size()-1).hand = temp;
        } else {
	        ArrayList<Card> temp = players.get(players.size()-1).hand;
	        for(int i = players.size()-1; i > 0; i--) {
	            players.get(i).hand = players.get(i-1).hand;
            }
            players.get(0).hand = temp;
        }
    }
}
