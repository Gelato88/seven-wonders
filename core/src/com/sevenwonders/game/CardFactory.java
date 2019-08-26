package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class CardFactory {

    private Map<Integer, BrownCardInfo> brownCards;
    private Map<Integer, GrayCardInfo> grayCards;
    private Map<Integer, YellowCardInfo> yellowCards;
    private Map<Integer, BlueCardInfo> blueCards;
    private Map<Integer, RedCardInfo> redCards;
    private Map<Integer, GreenCardInfo> greenCards;

    public CardFactory(String path) {
        brownCards = new HashMap<Integer, BrownCardInfo>();
        grayCards = new HashMap<Integer, GrayCardInfo>();
        yellowCards = new HashMap<Integer, YellowCardInfo>();
        blueCards = new HashMap<Integer, BlueCardInfo>();
        redCards = new HashMap<Integer, RedCardInfo>();
        greenCards = new HashMap<Integer, GreenCardInfo>();
        JsonReader reader = new JsonReader();
        loadBrownCards(reader, path);
        loadGrayCards(reader, path);
        loadYellowCards(reader, path);
        loadBlueCards(reader, path);
        loadRedCards(reader, path);
        loadGreenCards(reader, path);
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

    private void loadYellowCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("yellowCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int leftBrownDiscount = card.getInt("leftBrownDiscount");
            int rightBrownDiscount = card.getInt("rightBrownDiscount");
            int grayDiscount = card.getInt("grayDiscount");
            int coins = card.getInt("coins");
            int chooseBrown = card.getInt("chooseBrown");
            int chooseGray = card.getInt("chooseGray");
            int coinsPerSideBrown = card.getInt("coinsPerSideBrown");
            int coinsPerBrown = card.getInt("coinsPerBrown");
            int coinsPerSideGray = card.getInt("coinsPerSideGray");
            int coinsPerGray = card.getInt("coinsPerGray");
            int coinsPerWonderStage = card.getInt("coinsPerWonderStage");
            int coinsPerYellow = card.getInt("coinsPerYellow");
            int pointsPerWonderStage = card.getInt("pointsPerWonderStage");
            int pointsPerYellow = card.getInt("pointsPerYellow");
            int pointsPerBrown = card.getInt("pointsPerBrown");
            int pointsPerGray = card.getInt("pointsPerGray");

            YellowCardInfo info = new YellowCardInfo(id, age, name, texture, leftBrownDiscount, rightBrownDiscount,
                    grayDiscount, coins, chooseBrown, chooseGray, coinsPerSideBrown, coinsPerBrown, coinsPerSideGray,
                    coinsPerGray, coinsPerWonderStage, coinsPerYellow, pointsPerWonderStage, pointsPerYellow,
                    pointsPerBrown, pointsPerGray);
            yellowCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading yellow cards.");
    }

    private void loadBlueCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("blueCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int points = card.getInt("points");

            BlueCardInfo info = new BlueCardInfo(id, age, name, texture, points);
            blueCards.put(id, info);
        }
        Gdx.app.log("CardFactory","Completed loading blue cards.");
    }

    private void loadRedCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("redCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int military = card.getInt("military");

            RedCardInfo info = new RedCardInfo(id, age, name, texture, military);
            redCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading red cards.");
    }

    private void loadGreenCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("greenCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int compass = card.getInt("compass");
            int gear = card.getInt("gear");
            int tablet = card.getInt("tablet");

            GreenCardInfo info = new GreenCardInfo(id, age, name, texture, compass, gear, tablet);
            greenCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading green cards.");
    }

}
