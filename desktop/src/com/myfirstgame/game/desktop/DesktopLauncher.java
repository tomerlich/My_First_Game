package com.myfirstgame.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.myfirstgame.game.MyFirstGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MyFirstGame.WIDTH;
		config.height = MyFirstGame.HEIGHT;
		config.title = MyFirstGame.TITLE;
		new LwjglApplication(new MyFirstGame(), config);

	}
}
