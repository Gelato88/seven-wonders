package com.sevenwonders.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Assets {

    public static Sprite resourceBacking;
    public static Sprite coins;
    public static Sprite bricks;
    public static Sprite stones;

    public static void load() {
        resourceBacking = new Sprite(new Texture("textures/ResourceBacking.png"));
        resourceBacking.setPosition(0, Settings.RESOLUTION.y - resourceBacking.getHeight());
        coins = new Sprite(new Texture("textures/coins.png"));
        bricks = new Sprite(new Texture("textures/bricks2.png"));
        stones = new Sprite(new Texture("textures/stones2.png"));
        coins.setSize(64f, 64f);
        bricks.setSize(64f, 64f);
        stones.setSize(64f, 64f);
    }

}
