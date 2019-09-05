package com.sevenwonders.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.Set;

public class Assets {

    public static Sprite resourceBacking;
    public static Sprite coins;
    public static Sprite bricks;
    public static Sprite stones;
    public static Sprite ore;

    public static Sprite confirmButton;
    public static Sprite warningButton;
    public static Sprite invalidButton;
    public static Sprite cancelButton;

    public static void load() {
        resourceBacking = new Sprite(new Texture("textures/ResourceBacking.png"));
        resourceBacking.setPosition(0, Settings.RESOLUTION.y - resourceBacking.getHeight());
        coins = new Sprite(new Texture("textures/coins.png"));
        bricks = new Sprite(new Texture("textures/bricks2.png"));
        stones = new Sprite(new Texture("textures/stones2.png"));
        ore = new Sprite(new Texture("textures/ore.png"));
        coins.setSize(64f, 64f);
        bricks.setSize(64f, 64f);
        stones.setSize(64f, 64f);
        ore.setSize(64f, 64f);

        confirmButton = new Sprite(new Texture("textures/ConfirmButton.png"));
        warningButton = new Sprite(new Texture("textures/WarningButton.png"));
        invalidButton = new Sprite(new Texture("textures/InvalidButton.png"));
        cancelButton = new Sprite(new Texture("textures/CancelButton.png"));
    }

}
