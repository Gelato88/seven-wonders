package com.sevenwonders.game.Cards;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class CardInfo {

    protected String name;
    protected String texture;
    protected int coinCost;
    protected int lumberCost;
    protected int oreCost;
    protected int clayCost;
    protected int stoneCost;
    protected int textileCost;
    protected int glassCost;
    protected int papyrusCost;
    protected String freeCard;

    protected Sprite sprite;

    CardInfo(String name, String texture, int coinCost, int lumberCost, int oreCost, int clayCost, int stoneCost, int textileCost, int glassCost,
             int papyrusCost, String freeCard) {
        this.name = name;
        this.texture = texture;
        this.coinCost = coinCost;
        this.lumberCost = lumberCost;
        this.oreCost = oreCost;
        this.clayCost = clayCost;
        this.stoneCost = stoneCost;
        this.textileCost = textileCost;
        this.glassCost = glassCost;
        this.papyrusCost = papyrusCost;
        this.freeCard = freeCard;

        sprite = new Sprite(new Texture(Gdx.files.internal("textures/" + texture)));
    }
}
