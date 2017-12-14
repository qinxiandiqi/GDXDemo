package com.qinxiandiqi.gdxdemo.game;

import android.support.annotation.NonNull;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Pools;

/**
 * 开始游戏界面
 * Created by Jianan on 2017/8/22.
 */
public class StartScreen extends AbsScreen {

    private String text = "你好，中文!!! ";
    private Input.TextInputListener textInputListener;

    AssetManager assetManager;
    FreetypeFontLoader.FreeTypeFontLoaderParameter parameter;

    public StartScreen(@NonNull MainGame game) {
        super(game);
    }

    @Override
    public void show() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        assetManager = new AssetManager();
        textInputListener = new StartTextInputListener();

        assetManager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(assetManager.getFileHandleResolver()));
        assetManager.setLoader(BitmapFont.class, new FreetypeFontLoader(assetManager.getFileHandleResolver()));

        parameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
        parameter.fontFileName = "simkai.ttf";
        parameter.fontParameters.incremental = true;
        parameter.fontParameters.size = 80;
        parameter.fontParameters.genMipMaps = true;
        parameter.fontParameters.minFilter = Texture.TextureFilter.Linear;
        parameter.fontParameters.magFilter = Texture.TextureFilter.Linear;

        assetManager.load(parameter.fontFileName + parameter.fontParameters.size, BitmapFont.class, parameter);
    }

    @Override
    public void render(float delta) {
        assetManager.update();
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        if (assetManager.isLoaded(parameter.fontFileName + parameter.fontParameters.size)) {
            final BitmapFont bitmapFont = assetManager.get(parameter.fontFileName + parameter.fontParameters.size, BitmapFont.class);
            game.batch.begin();
            Color textColor = Pools.obtain(Color.class);
            textColor.set(MathUtils.random(0F, 1F), MathUtils.random(0F, 1F), MathUtils.random(0F, 1F), MathUtils.random(0F, 1F));
            GlyphLayout glyphLayout = Pools.obtain(GlyphLayout.class);
            glyphLayout.setText(bitmapFont, text, textColor, Gdx.graphics.getWidth(), Align.left, true);
            bitmapFont.draw(game.batch, glyphLayout, 0, Gdx.graphics.getHeight());
            Pools.free(glyphLayout);
            Pools.free(textColor);
            game.batch.end();
        }

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
        assetManager.dispose();
    }

    private class StartTextInputListener implements Input.TextInputListener {
        @Override
        public void input(String text) {
            StartScreen.this.text = text;
        }

        @Override
        public void canceled() {
            parameter.fontParameters.size = MathUtils.random((int)(Gdx.graphics.getDensity() * 10 + 0.5), (int)(Gdx.graphics.getDensity() * 20 + 0.5));
            assetManager.load(parameter.fontFileName + parameter.fontParameters.size, BitmapFont.class, parameter);
        }
    }

}
