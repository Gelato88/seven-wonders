package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class CardFactory {

    private Map<Integer, BrownCardInfo> brownCards;
    private Map<Integer, GrayCardInfo> grayCards;

    public CardFactory(String path) {
        brownCards = new HashMap<Integer, BrownCardInfo>();
        grayCards = new HashMap<Integer, GrayCardInfo>();
        JsonReader reader = new JsonReader();
        loadBrownCards(reader, path);
        loadGrayCards(reader, path);
    }

    private void loadBrownCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("brownCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int coinCost = card.getInt("coinCost");
            int lumber = card.getInt("lumber");
            int ore = card.getInt("ore");
            int clay = card.getInt("clay");
            int stone = card.getInt("stone");

            BrownCardInfo info = new BrownCardInfo(id, age, name, texture, coinCost, lumber, ore, clay, stone);
            brownCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading brown cards.");
    }

    private void loadGrayCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("grayCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int textile = card.getInt("textile");
            int glass = card.getInt("glass");
            int papyrus = card.getInt("papyrus");

            GrayCardInfo info = new GrayCardInfo(id, age, name, texture, textile, glass, papyrus);
            grayCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading gray cards.");
    }

}
