package com.myfirstgame.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myfirstgame.game.States.GameStateManager;

import java.util.Stack;

public class MyFirstGame extends ApplicationAdapter {
	SpriteBatch batch;
    Texture img;
	Stack<GameStateManager> gsm;        //stack of states to determine what the screen will show
	
	@Override
	public void create () {
		batch = new SpriteBatch();
	    img = new Texture("badlogic.jpg");
    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
