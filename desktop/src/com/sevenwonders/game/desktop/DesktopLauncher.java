package com.sevenwonders.game.desktop;

import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sevenwonders.game.Settings;
import com.sevenwonders.game.SevenWonders;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		Graphics.DisplayMode displayMode = LwjglApplicationConfiguration.getDesktopDisplayMode();
		config.setFromDisplayMode(displayMode);
		config.fullscreen = false;
		config.width = (int)Settings.RESOLUTION.x;
		config.height = (int)Settings.RESOLUTION.y;
		new LwjglApplication(new SevenWonders(), config);
	}
}
