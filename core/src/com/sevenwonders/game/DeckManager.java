package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import com.sevenwonders.game.Cards.Card;
import com.sevenwonders.game.Cards.CardFactory;

import java.util.ArrayList;

public class DeckManager {

    CardFactory factory;
    ArrayList<Card> age1Deck;
    ArrayList<Card> age2Deck;
    ArrayList<Card> age3Deck;

    public DeckManager(String path, CardFactory factory) {
        age1Deck = new ArrayList<Card>();
        age2Deck = new ArrayList<Card>();
        age3Deck = new ArrayList<Card>();
        this.factory = factory;
        resetDecks(path);
        Gdx.app.log("DeckManage", "Decks loaded for " + Settings.players + " players.");
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
