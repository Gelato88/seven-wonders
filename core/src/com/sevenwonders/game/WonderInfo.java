package com.sevenwonders.game;

import java.util.HashMap;

public class WonderInfo {

    protected int id;
    protected String name;
    protected String texture;
    protected int stageNumber;
    protected int lumber;
    protected int ore;
    protected int clay;
    protected int stone;
    protected int textile;
    protected int glass;
    protected int papyrus;
    protected HashMap stages;

    public WonderInfo(int id, String name, String texture, int stageNumber, int lumber, int ore, int clay, int stone,
                      int textile, int glass, int papyrus, HashMap stages) {
        this.id = id;
        this.name = name;
        this.texture = texture;
        this.stageNumber = stageNumber;
        this.lumber = lumber;
        this.ore = ore;
        this.clay = clay;
        this.stone = stone;
        this.textile = textile;
        this.glass = glass;
        this.papyrus = papyrus;
        this.stages = stages;
    }

}
