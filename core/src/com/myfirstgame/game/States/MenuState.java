package com.myfirstgame.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.myfirstgame.game.MyFirstGame;

/**
 * Created by tomer on 6/30/2017.
 */

public class MenuState extends State {
    private Texture playBtn;
    private BitmapFont nameLabel;
    private Rectangle playBtnBounds;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        cam.setToOrtho(false, MyFirstGame.WIDTH / 2, MyFirstGame.HEIGHT / 2);
        playBtn = new Texture("playBtn.jpg");
        nameLabel = new BitmapFont();
        playBtnBounds = new Rectangle((float) 208, (float)384, 64, 32);
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched() && playBtnBounds.contains(Gdx.input.getX(), Gdx.input.getY())) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        sb.begin();
        sb.draw(
                playBtn,
                playBtnBounds.getX(),
                playBtnBounds.getY()
        );
        nameLabel.draw(
                sb,
                "My First Game",
                MyFirstGame.WIDTH / 2 - (MyFirstGame.WIDTH / 12),
                MyFirstGame.HEIGHT / 2 + (MyFirstGame.HEIGHT / 4));
        sb.end();
    }
}
