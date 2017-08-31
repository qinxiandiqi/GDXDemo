package com.qinxiandiqi.gdxdemo.office;

import com.badlogic.gdx.Gdx;
import com.qinxiandiqi.gdxdemo.office.utils.GdxTest;

public class ShortSoundTest extends GdxTest {

	@Override
	public void create () {
		Gdx.audio.newSound(Gdx.files.internal("data/tic.ogg")).play();
	}

}
