package com.qinxiandiqi.gdxdemo.game;

import android.support.annotation.NonNull;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * 开始游戏界面
 * Created by Jianan on 2017/8/22.
 */
public class StartScreen extends AbsScreen {

    private String text = "Hello World!!! ";
    private Input.TextInputListener textInputListener;

    public StartScreen(@NonNull MainGame game) {
        super(game);
    }

    @Override
    public void show() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        textInputListener = new StartTextInputListener();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, text, 100, 150);
        game.batch.end();

        if (Gdx.input.justTouched()) {
            Gdx.input.getTextInput(textInputListener, "INPUT", text, "Please input text");
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
    }

    private class StartTextInputListener implements Input.TextInputListener {
        @Override
        public void input(String text) {
            StartScreen.this.text = text;
        }

        @Override
        public void canceled() {

        }
    }
}
