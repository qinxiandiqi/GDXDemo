/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.qinxiandiqi.gdxdemo.office;

import com.badlogic.gdx.Gdx;
import com.qinxiandiqi.gdxdemo.office.utils.GdxTest;
import com.badlogic.gdx.utils.TimeUtils;

public class DeltaTimeTest extends GdxTest {

	long lastFrameTime;

	@Override
	public void create () {
		lastFrameTime = TimeUtils.nanoTime();
	}

	@Override
	public void render () {
		long frameTime = TimeUtils.nanoTime();
		float deltaTime = (frameTime - lastFrameTime) / 1000000000.0f;
		lastFrameTime = frameTime;

		Gdx.app.log("DeltaTimeTest", "delta: " + deltaTime + ", gdx delta: " + Gdx.graphics.getDeltaTime());
	}
}