package com.myfirstgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myfirstgame.game.MyFirstGame;

/**
 * Created by tomer on 6/30/2017.
 */

public class MenuState extends State {
    private Texture playbtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, MyFirstGame.WIDTH / 2, MyFirstGame.HEIGHT / 2);
        playbtn = new Texture("playbtn.jpg");

    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        sb.begin();
        sb.draw(
                playbtn,
                MyFirstGame.WIDTH / 2 - playbtn.getWidth() / 2,
                MyFirstGame.HEIGHT / 2 - playbtn.getHeight() / 2
        );
        sb.end();
    }
}
