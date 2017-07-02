package com.myfirstgame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myfirstgame.game.States.GameStateManager;
import com.myfirstgame.game.States.MenuState;


public class MyFirstGame extends ApplicationAdapter {
	public static final int WIDTH = 480;
    public static final int HEIGHT = 800;
	public static final String  TITLE = "My First Game";
    public static final float SCALE = 0.5f;

    private SpriteBatch spriteBatch;
    private GameStateManager gameStateManager;

	@Override
	public void create () {
		spriteBatch = new SpriteBatch();
        gameStateManager = new GameStateManager();
        gameStateManager.push(new MenuState(gameStateManager));
        Gdx.gl.glClearColor(1, 0, 0, 1);
    }

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameStateManager.update(Gdx.graphics.getDeltaTime());
        gameStateManager.render(spriteBatch);
	}
	
	@Override
	public void dispose () {
		spriteBatch.dispose();
	}
}
