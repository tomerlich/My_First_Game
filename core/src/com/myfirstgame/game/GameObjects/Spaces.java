package com.myfirstgame.game.GameObjects;

import com.badlogic.gdx.math.Rectangle;

/**
 * Created by tomer on 7/3/2017.
 */

public class Spaces {
    private boolean isFilled;
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    public Spaces(float x, float y) {
        isFilled = false;
    }

    public boolean isFilled() {
        return isFilled;
    }

}
