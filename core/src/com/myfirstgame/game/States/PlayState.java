package com.myfirstgame.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by tomer on 6/30/2017.
 */

public class PlayState extends State {

    private boolean gameOver;

    public PlayState(GameStateManager gsm) {
        super(gsm);

        gameOver = false;
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {

    }
}
