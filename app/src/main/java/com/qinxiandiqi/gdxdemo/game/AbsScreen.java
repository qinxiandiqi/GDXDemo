package com.qinxiandiqi.gdxdemo.game;

import android.support.annotation.NonNull;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by Jianan on 2017/8/22.
 */
public abstract class AbsScreen implements Screen {

    MainGame game;
    OrthographicCamera camera;

    public AbsScreen(@NonNull MainGame game) {
        this.game = game;
    }

    @Override
    public void hide() {
        dispose();
    }
}
