package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import com.sevenwonders.game.Cards.Card;
import com.sevenwonders.game.Cards.CardFactory;

import java.util.ArrayList;

public class DeckManager {

    CardFactory factory;
    SevenWonders game;
    ArrayList<Card> age1Deck;
    ArrayList<Card> age2Deck;
    ArrayList<Card> age3Deck;

    public DeckManager(String path, CardFactory factory, SevenWonders game) {
        age1Deck = new ArrayList<Card>();
        age2Deck = new ArrayList<Card>();
        age3Deck = new ArrayList<Card>();
        this.factory = factory;
        this.game = game;
        resetDecks(path);
        Gdx.app.log("DeckManager", "Decks loaded for " + Settings.players + " players.");
        System.out.println();
    }

    private void fillDeck(JsonValue age, ArrayList<Card> deck) {
        for(int id : age.get("brownCards").asIntArray()) {
            deck.add(factory.createBrownCard(id));
        }
        for(int id : age.get("grayCards").asIntArray()) {
            deck.add(factory.createGrayCard(id));
        }
        for(int id : age.get("yellowCards").asIntArray()) {
            deck.add(factory.createYellowCard(id));
        }
        for(int id : age.get("blueCards").asIntArray()) {
            deck.add(factory.createBlueCard(id));
        }
        for(int id : age.get("redCards").asIntArray()) {
            deck.add(factory.createRedCard(id));
        }
        for(int id : age.get("greenCards").asIntArray()) {
            deck.add(factory.createGreenCard(id));
        }
    }

    public void resetDecks(String path) {
        age1Deck.clear();
        age2Deck.clear();
        age3Deck.clear();

        JsonReader reader = new JsonReader();
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("3 player");

        JsonValue age1 = root.get("age 1");
        JsonValue age2 = root.get("age 2");
        JsonValue age3 = root.get("age 3");

        fillDeck(age1, age1Deck);
        fillDeck(age2, age2Deck);
        fillDeck(age3, age3Deck);

        shuffleDeck(age1Deck);
        shuffleDeck(age2Deck);
        shuffleDeck(age3Deck);

    }

    private void shuffleDeck(ArrayList<Card> deck) {
        for(int i = 0; i < deck.size(); i++) {
            int rand = (int)(Math.random() * (deck.size() - i));
            deck.add(deck.remove(rand));
        }
    }

    public void deal(int age) {
        switch(age) {
            case 1:
                dealAge(age1Deck);
                break;
            case 2:
                dealAge(age2Deck);
                break;
            case 3:
                dealAge(age3Deck);
                break;
            default:
                Gdx.app.log("DeckManager","Invalid age found.");
        }
    }

    private void dealAge(ArrayList<Card> deck) {
        System.out.println(deck.size());
        int playerCounter = 0;
        for(Card c : deck) {
            game.players.get(playerCounter).addToHand(c);
            playerCounter++;
            if(playerCounter >= game.players.size()) {
                playerCounter = 0;
            }
        }
    }

    public ArrayList<Card> getAge1Deck() {
        return age1Deck;
    }
    public ArrayList<Card> getAge2Deck() {
        return age2Deck;
    }
    public ArrayList<Card> getAge3Deck() {
        return age3Deck;
    }
}
