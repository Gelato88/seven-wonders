package com.sevenwonders.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class WonderFactory {

    private Map<Integer, WonderInfo> wonders;

    public WonderFactory(String path) {

        wonders = new HashMap<Integer, WonderInfo>();
        JsonReader reader = new JsonReader();
        JsonValue root = reader.parse(Gdx.files.internal(path)).get("wonders");
        for(JsonValue wonder : root) {
            HashMap stages = new HashMap<Integer, HashMap<String, Integer>>();
            int id = wonder.getInt("id");
            String name = wonder.getString("name");
            String texture = wonder.getString("texture");
            int lumber = wonder.getInt("lumber");
            int ore = wonder.getInt("ore");
            int clay = wonder.getInt("clay");
            int stone = wonder.getInt("stone");
            int textile = wonder.getInt("textile");
            int glass = wonder.getInt("glass");
            int papyrus = wonder.getInt("papyrus");
            int stageNumber = wonder.getInt("stages");
            for(int i = 1; i <= stageNumber; i++) {
                HashMap map = new HashMap<String, Integer>();
                String stageName = "stage" + i;
                JsonValue stage = wonder.get(stageName);
                map.put("lumberCost", stage.getInt("lumberCost"));
                map.put("oreCost", stage.getInt("oreCost"));
                map.put("clayCost", stage.getInt("clayCost"));
                map.put("stoneCost", stage.getInt("stoneCost"));
                map.put("textileCost", stage.getInt("textileCost"));
                map.put("glassCost", stage.getInt("glassCost"));
                map.put("papyrusCost", stage.getInt("papyrusCost"));
                stages.put(i, map);
            }
            WonderInfo info = new WonderInfo(id, name, texture, stageNumber, lumber, ore, clay, stone, textile, glass,
            papyrus, stages);
            wonders.put(id, info);
        }
        Gdx.app.log("WonderFactory", "Completed loading wonders.");
    }
}
