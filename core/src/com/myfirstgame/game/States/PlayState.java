package com.myfirstgame.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.myfirstgame.game.GameObjects.Spaces;
import com.myfirstgame.game.MyFirstGame;

/**
 * Created by tomer on 6/30/2017.
 */

public class PlayState extends State {
    private Rectangle playArea;
    private Spaces[][] spaces;
    private Texture spaceTexture;
    private boolean gameOver;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        playArea = new Rectangle(
                (MyFirstGame.WIDTH / 2) - 96,
                (MyFirstGame.HEIGHT / 2) - 96,
                192,
                192);
        spaceTexture = new Texture("Space.jpg");
        for(int i = 0; i < 3; i++){
            for (int g = 0; g < 3; g++){
                //spaces[i][g] = new Spaces((playArea.x * i), (playArea.y * g));
            }
        }
        gameOver = false;
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        for(int i = 0; i < 3; i++){
            for (int g = 0; g < 3; g++){
                sb.draw(spaceTexture, playArea.x * i, playArea.y * g);
            }
        }
        sb.end();
    }
}
