package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class CardFactory {

    private Map<Integer, BrownCardInfo> brownCards;

    public CardFactory(String path) {
        brownCards = new HashMap<Integer, BrownCardInfo>();
        JsonReader reader = new JsonReader();
        loadBrownCards(reader, path);
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

}
