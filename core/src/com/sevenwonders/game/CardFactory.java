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
    private Map<Integer, PurpleCardInfo> purpleCards;

    public CardFactory(String path) {
        brownCards = new HashMap<Integer, BrownCardInfo>();
        grayCards = new HashMap<Integer, GrayCardInfo>();
        yellowCards = new HashMap<Integer, YellowCardInfo>();
        blueCards = new HashMap<Integer, BlueCardInfo>();
        redCards = new HashMap<Integer, RedCardInfo>();
        greenCards = new HashMap<Integer, GreenCardInfo>();
        purpleCards = new HashMap<Integer, PurpleCardInfo>();
        JsonReader reader = new JsonReader();
        loadBrownCards(reader, path);
        loadGrayCards(reader, path);
        loadYellowCards(reader, path);
        loadBlueCards(reader, path);
        loadRedCards(reader, path);
        loadGreenCards(reader, path);
        loadPurpleCards(reader, path);
    }

    private void loadBrownCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("brownCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int lumber = card.getInt("lumber");
            int ore = card.getInt("ore");
            int clay = card.getInt("clay");
            int stone = card.getInt("stone");

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            BrownCardInfo info = new BrownCardInfo(id, age, name, texture, lumber, ore, clay, stone, coinCost,
                    lumberCost, oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
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

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            GrayCardInfo info = new GrayCardInfo(id, age, name, texture, textile, glass, papyrus, coinCost, lumberCost,
                    oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
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

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            YellowCardInfo info = new YellowCardInfo(id, age, name, texture, leftBrownDiscount, rightBrownDiscount,
                    grayDiscount, coins, chooseBrown, chooseGray, coinsPerSideBrown, coinsPerBrown, coinsPerSideGray,
                    coinsPerGray, coinsPerWonderStage, coinsPerYellow, pointsPerWonderStage, pointsPerYellow,
                    pointsPerBrown, pointsPerGray, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost,
                    glassCost, papyrusCost);
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

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            BlueCardInfo info = new BlueCardInfo(id, age, name, texture, points, coinCost, lumberCost, oreCost,
                    clayCost, stoneCost, textileCost, glassCost, papyrusCost);
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

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            RedCardInfo info = new RedCardInfo(id, age, name, texture, military, coinCost, lumberCost, oreCost,
                    clayCost, stoneCost, textileCost, glassCost, papyrusCost);
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

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            GreenCardInfo info = new GreenCardInfo(id, age, name, texture, compass, gear, tablet, coinCost, lumberCost,
                    oreCost, clayCost, stoneCost, textileCost, glassCost, papyrusCost);
            greenCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading green cards.");
    }

    private void loadPurpleCards(JsonReader reader, String path) {
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("purpleCards");
        for(JsonValue card : root) {
            int id = card.getInt("id");
            int age = card.getInt("age");
            String name = card.getString("name");
            String texture = card.getString("texture");
            int pointsPerSideBrown = card.getInt("pointsPerSideBrown");
            int pointsPerSideGray = card.getInt("pointsPerSideGray");
            int pointsPerSideYellow = card.getInt("pointsPerSideYellow");
            int pointsPerSideBlue = card.getInt("pointsPerSideBlue");
            int pointsPerSideWonderStage = card.getInt("pointsPerSideWonderStage");
            int pointsPerSideGreen = card.getInt("pointsPerSideGreen");
            int pointsPerSideRed = card.getInt("pointsPerSideRed");
            int pointsPerSideLoss = card.getInt("pointsPerSideLoss");
            int pointsPerBrown = card.getInt("pointsPerBrown");
            int pointsPerGray = card.getInt("pointsPerGray");
            int pointsPerPurple = card.getInt("pointsPerPurple");
            int pointsPerWonderStage = card.getInt("pointsPerWonderStage");
            int chooseGreen = card.getInt("chooseGreen");

            int coinCost = card.getInt("coinCost");
            int lumberCost = card.getInt("lumberCost");
            int oreCost = card.getInt("oreCost");
            int clayCost = card.getInt("clayCost");
            int stoneCost = card.getInt("stoneCost");
            int textileCost = card.getInt("textileCost");
            int glassCost = card.getInt("glassCost");
            int papyrusCost = card.getInt("papyrusCost");

            PurpleCardInfo info =  new PurpleCardInfo(id, age, name, texture, pointsPerSideBrown, pointsPerSideGray,
                    pointsPerSideYellow, pointsPerSideBlue, pointsPerSideWonderStage, pointsPerSideGreen,
                    pointsPerSideRed, pointsPerSideLoss, pointsPerBrown, pointsPerGray, pointsPerPurple,
                    pointsPerWonderStage, chooseGreen, coinCost, lumberCost, oreCost, clayCost, stoneCost, textileCost,
                    glassCost, papyrusCost);
            purpleCards.put(id, info);
        }
        Gdx.app.log("CardFactory", "Completed loading purple cards.");
    }

}
