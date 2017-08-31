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

package com.qinxiandiqi.gdxdemo.office.gwt;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.qinxiandiqi.gdxdemo.office.AccelerometerTest;
import com.qinxiandiqi.gdxdemo.office.ActionSequenceTest;
import com.qinxiandiqi.gdxdemo.office.ActionTest;
import com.qinxiandiqi.gdxdemo.office.AlphaTest;
import com.qinxiandiqi.gdxdemo.office.AnimationTest;
import com.qinxiandiqi.gdxdemo.office.AnnotationTest;
import com.qinxiandiqi.gdxdemo.office.AssetManagerTest;
import com.qinxiandiqi.gdxdemo.office.AtlasIssueTest;
import com.qinxiandiqi.gdxdemo.office.BitmapFontAlignmentTest;
import com.qinxiandiqi.gdxdemo.office.BitmapFontFlipTest;
import com.qinxiandiqi.gdxdemo.office.BitmapFontMetricsTest;
import com.qinxiandiqi.gdxdemo.office.BitmapFontTest;
import com.qinxiandiqi.gdxdemo.office.BlitTest;
import com.qinxiandiqi.gdxdemo.office.Box2DCharacterControllerTest;
import com.qinxiandiqi.gdxdemo.office.Box2DTest;
import com.qinxiandiqi.gdxdemo.office.Box2DTestCollection;
import com.qinxiandiqi.gdxdemo.office.BufferUtilsTest;
import com.qinxiandiqi.gdxdemo.office.ColorTest;
import com.qinxiandiqi.gdxdemo.office.ComplexActionTest;
import com.qinxiandiqi.gdxdemo.office.CustomShaderSpriteBatchTest;
import com.qinxiandiqi.gdxdemo.office.DecalTest;
import com.qinxiandiqi.gdxdemo.office.EdgeDetectionTest;
import com.qinxiandiqi.gdxdemo.office.FilterPerformanceTest;
import com.qinxiandiqi.gdxdemo.office.FrameBufferTest;
import com.qinxiandiqi.gdxdemo.office.FramebufferToTextureTest;
import com.qinxiandiqi.gdxdemo.office.GLProfilerErrorTest;
import com.qinxiandiqi.gdxdemo.office.GWTLossyPremultipliedAlphaTest;
import com.qinxiandiqi.gdxdemo.office.GestureDetectorTest;
import com.qinxiandiqi.gdxdemo.office.GroupCullingTest;
import com.qinxiandiqi.gdxdemo.office.GroupFadeTest;
import com.qinxiandiqi.gdxdemo.office.I18NSimpleMessageTest;
import com.qinxiandiqi.gdxdemo.office.ImageScaleTest;
import com.qinxiandiqi.gdxdemo.office.ImageTest;
import com.qinxiandiqi.gdxdemo.office.IndexBufferObjectShaderTest;
import com.qinxiandiqi.gdxdemo.office.IntegerBitmapFontTest;
import com.qinxiandiqi.gdxdemo.office.InterpolationTest;
import com.qinxiandiqi.gdxdemo.office.InverseKinematicsTest;
import com.qinxiandiqi.gdxdemo.office.IsometricTileTest;
import com.qinxiandiqi.gdxdemo.office.KinematicBodyTest;
import com.qinxiandiqi.gdxdemo.office.LabelScaleTest;
import com.qinxiandiqi.gdxdemo.office.LabelTest;
import com.qinxiandiqi.gdxdemo.office.LifeCycleTest;
import com.qinxiandiqi.gdxdemo.office.MeshShaderTest;
import com.qinxiandiqi.gdxdemo.office.MipMapTest;
import com.qinxiandiqi.gdxdemo.office.MultitouchTest;
import com.qinxiandiqi.gdxdemo.office.MusicTest;
import com.qinxiandiqi.gdxdemo.office.ParallaxTest;
import com.qinxiandiqi.gdxdemo.office.ParticleEmitterTest;
import com.qinxiandiqi.gdxdemo.office.PixelsPerInchTest;
import com.qinxiandiqi.gdxdemo.office.ProjectiveTextureTest;
import com.qinxiandiqi.gdxdemo.office.ReflectionCorrectnessTest;
import com.qinxiandiqi.gdxdemo.office.ReflectionTest;
import com.qinxiandiqi.gdxdemo.office.RotationTest;
import com.qinxiandiqi.gdxdemo.office.ShapeRendererTest;
import com.qinxiandiqi.gdxdemo.office.SimpleAnimationTest;
import com.qinxiandiqi.gdxdemo.office.SimpleDecalTest;
import com.qinxiandiqi.gdxdemo.office.SimpleStageCullingTest;
import com.qinxiandiqi.gdxdemo.office.SortedSpriteTest;
import com.qinxiandiqi.gdxdemo.office.SoundTest;
import com.qinxiandiqi.gdxdemo.office.SpriteBatchShaderTest;
import com.qinxiandiqi.gdxdemo.office.SpriteCacheOffsetTest;
import com.qinxiandiqi.gdxdemo.office.SpriteCacheTest;
import com.qinxiandiqi.gdxdemo.office.StageTest;
import com.qinxiandiqi.gdxdemo.office.TableTest;
import com.qinxiandiqi.gdxdemo.office.TextButtonTest;
import com.qinxiandiqi.gdxdemo.office.TextureAtlasTest;
import com.qinxiandiqi.gdxdemo.office.TiledMapAtlasAssetManagerTest;
import com.qinxiandiqi.gdxdemo.office.TimeUtilsTest;
import com.qinxiandiqi.gdxdemo.office.UITest;
import com.qinxiandiqi.gdxdemo.office.VertexBufferObjectShaderTest;
import com.qinxiandiqi.gdxdemo.office.YDownTest;
import com.qinxiandiqi.gdxdemo.office.conformance.DisplayModeTest;
import com.qinxiandiqi.gdxdemo.office.extensions.ControllersTest;
import com.qinxiandiqi.gdxdemo.office.g3d.ModelCacheTest;
import com.qinxiandiqi.gdxdemo.office.g3d.ShadowMappingTest;
import com.qinxiandiqi.gdxdemo.office.superkoalio.SuperKoalio;
import com.qinxiandiqi.gdxdemo.office.utils.GdxTest;

import java.util.Arrays;
import java.util.Comparator;

public class GwtTestWrapper extends GdxTest {
	Stage ui;
	Table container;
	Skin skin;
	BitmapFont font;
	GdxTest test;
	boolean dispose = false;

	@Override
	public void create () {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		Gdx.app.log("GdxTestGwt", "Setting up for " + tests.length + " tests.");

		ui = new Stage();
		skin = new Skin(Gdx.files.internal("data/uiskin.json"));
		font = new BitmapFont(Gdx.files.internal("data/arial-15.fnt"), false);
		container = new Table();
		ui.addActor(container);
		container.debug();
		Table table = new Table();
		ScrollPane scroll = new ScrollPane(table);
		container.add(scroll).expand().fill();
		table.pad(10).defaults().expandX().space(4);
		Arrays.sort(tests, new Comparator<Instancer>() {
			@Override
			public int compare (Instancer o1, Instancer o2) {
				return o1.instance().getClass().getName().compareTo(o2.instance().getClass().getName());
			}
		});
		for (final Instancer instancer : tests) {
			table.row();
			TextButton button = new TextButton(instancer.instance().getClass().getName(), skin);
			button.addListener(new ClickListener() {
				@Override
				public void clicked (InputEvent event, float x, float y) {
					((InputWrapper) Gdx.input).multiplexer.removeProcessor(ui);
					test = instancer.instance();
					Gdx.app.log("GdxTestGwt", "Clicked on " + test.getClass().getName());
					test.create();
					test.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
				}
			});
			table.add(button).expandX().fillX();
		}
		container.row();
		container.add(new Label("Click on a test to start it, press ESC to close it.", new LabelStyle(font, Color.WHITE))).pad(5,
			5, 5, 5);

		Gdx.input = new InputWrapper(Gdx.input) {
			@Override
			public boolean keyUp (int keycode) {
				if (keycode == Keys.ESCAPE) {
					if (test != null) {
						Gdx.app.log("GdxTestGwt", "Exiting current test.");
						dispose = true;
					}
				}
				return false;
			}

			@Override
			public boolean touchDown (int screenX, int screenY, int pointer, int button) {
				if (screenX < Gdx.graphics.getWidth() / 10.0 && screenY < Gdx.graphics.getHeight() / 10.0) {
					if (test != null) {
						dispose = true;
					}
				}
				return false;
			}
		};
		((InputWrapper) Gdx.input).multiplexer.addProcessor(ui);

		Gdx.app.log("GdxTestGwt", "Test picker UI setup complete.");
	}

	public void render () {
		if (test == null) {
			Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
			Gdx.gl.glClearColor(0, 0, 0, 0);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			ui.act(Gdx.graphics.getDeltaTime());
			ui.draw();
		} else {
			if (dispose) {
				test.pause();
				test.dispose();
				test = null;
				Gdx.graphics.setVSync(true);
				InputWrapper wrapper = ((InputWrapper) Gdx.input);
				wrapper.multiplexer.addProcessor(ui);
				wrapper.multiplexer.removeProcessor(wrapper.lastProcessor);
				wrapper.lastProcessor = null;
				dispose = false;
			} else {
				test.render();
			}
		}
	}

	public void resize (int width, int height) {
		ui.getViewport().update(width, height, true);
		container.setSize(width, height);
		if (test != null) {
			test.resize(width, height);
		}
	}

	class InputWrapper extends InputAdapter implements Input {
		Input input;
		InputProcessor lastProcessor;
		InputMultiplexer multiplexer;

		public InputWrapper (Input input) {
			this.input = input;
			this.multiplexer = new InputMultiplexer();
			this.multiplexer.addProcessor(this);
			input.setInputProcessor(multiplexer);
		}

		@Override
		public float getAccelerometerX () {
			return input.getAccelerometerX();
		}

		@Override
		public float getAccelerometerY () {
			return input.getAccelerometerY();
		}

		@Override
		public float getAccelerometerZ () {
			return input.getAccelerometerZ();
		}

		@Override
		public float getGyroscopeX () {
			// TODO Auto-generated method stub
			return input.getGyroscopeX();
		}

		@Override
		public float getGyroscopeY () {
			// TODO Auto-generated method stub
			return input.getGyroscopeY();
		}

		@Override
		public float getGyroscopeZ () {
			// TODO Auto-generated method stub
			return input.getGyroscopeZ();
		}
		
		@Override
		public int getX () {
			return input.getX();
		}

		@Override
		public int getX (int pointer) {
			return input.getX(pointer);
		}

		@Override
		public int getDeltaX () {
			return input.getDeltaX();
		}

		@Override
		public int getDeltaX (int pointer) {
			return input.getDeltaX(pointer);
		}

		@Override
		public int getY () {
			return input.getY();
		}

		@Override
		public int getY (int pointer) {
			return input.getY(pointer);
		}

		@Override
		public int getDeltaY () {
			return input.getDeltaY();
		}

		@Override
		public int getDeltaY (int pointer) {
			return input.getDeltaY(pointer);
		}

		@Override
		public boolean isTouched () {
			return input.isTouched();
		}

		@Override
		public boolean justTouched () {
			return input.justTouched();
		}

		@Override
		public boolean isTouched (int pointer) {
			return input.isTouched(pointer);
		}

		@Override
		public boolean isButtonPressed (int button) {
			return input.isButtonPressed(button);
		}

		@Override
		public boolean isKeyPressed (int key) {
			return input.isKeyPressed(key);
		}

		@Override
		public boolean isKeyJustPressed (int key) {
			return input.isKeyJustPressed(key);
		}

		@Override
		public void getTextInput (TextInputListener listener, String title, String text, String hint) {
			input.getTextInput(listener, title, text, hint);
		}

		@Override
		public void setOnscreenKeyboardVisible (boolean visible) {
			input.setOnscreenKeyboardVisible(visible);
		}

		@Override
		public void vibrate (int milliseconds) {
			input.vibrate(milliseconds);
		}

		@Override
		public void vibrate (long[] pattern, int repeat) {
			input.vibrate(pattern, repeat);
		}

		@Override
		public void cancelVibrate () {
			input.cancelVibrate();
		}

		@Override
		public float getAzimuth () {
			return input.getAzimuth();
		}

		@Override
		public float getPitch () {
			return input.getPitch();
		}

		@Override
		public float getRoll () {
			return input.getRoll();
		}

		@Override
		public void getRotationMatrix (float[] matrix) {
			input.getRotationMatrix(matrix);
		}

		@Override
		public long getCurrentEventTime () {
			return input.getCurrentEventTime();
		}

		@Override
		public void setCatchBackKey (boolean catchBack) {
			input.setCatchBackKey(catchBack);
		}

		@Override
		public boolean isCatchBackKey() {
			return input.isCatchBackKey();
		}

		@Override
		public void setCatchMenuKey (boolean catchMenu) {
			input.setCatchMenuKey(catchMenu);
		}
		
		@Override
		public boolean isCatchMenuKey () {
			return input.isCatchMenuKey();
		}

		@Override
		public void setInputProcessor (InputProcessor processor) {
			multiplexer.removeProcessor(lastProcessor);
			multiplexer.addProcessor(processor);
			lastProcessor = processor;
		}

		@Override
		public InputProcessor getInputProcessor () {
			return input.getInputProcessor();
		}

		@Override
		public boolean isPeripheralAvailable (Peripheral peripheral) {
			return input.isPeripheralAvailable(peripheral);
		}

		@Override
		public int getRotation () {
			return input.getRotation();
		}

		@Override
		public Orientation getNativeOrientation () {
			return input.getNativeOrientation();
		}

		@Override
		public void setCursorCatched (boolean catched) {
			input.setCursorCatched(catched);
		}

		@Override
		public boolean isCursorCatched () {
			return input.isCursorCatched();
		}

		@Override
		public void setCursorPosition (int x, int y) {
			setCursorPosition(x, y);
		}
	}

	interface Instancer {
		public GdxTest instance();
	}

	Instancer[] tests = {new Instancer() {
		public GdxTest instance () {
			return new AccelerometerTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new ActionTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new ActionSequenceTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new AlphaTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new AnimationTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new AnnotationTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new AssetManagerTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new AtlasIssueTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BitmapFontAlignmentTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BitmapFontFlipTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BitmapFontTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BitmapFontMetricsTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BlitTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new Box2DCharacterControllerTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new Box2DTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new Box2DTestCollection();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new BufferUtilsTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new ColorTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new ComplexActionTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new ControllersTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new CustomShaderSpriteBatchTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new DecalTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new DisplayModeTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new LabelScaleTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new EdgeDetectionTest();
		}
	}, new Instancer() {
		public GdxTest instance () {
			return new FilterPerformanceTest();
		}
	},
// new Instancer() {public GdxTest instance(){return new FlickScrollPaneTest();}}, // FIXME this messes up stuff, why?
		new Instancer() {
			public GdxTest instance () {
				return new FrameBufferTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new FramebufferToTextureTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new GestureDetectorTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new GLProfilerErrorTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new GroupCullingTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new GroupFadeTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new I18NSimpleMessageTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ImageScaleTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ImageTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new IndexBufferObjectShaderTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new IntegerBitmapFontTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new InterpolationTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new InverseKinematicsTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new IsometricTileTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new KinematicBodyTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new LifeCycleTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new LabelTest();
			}
		},
// new Instancer() {public GdxTest instance(){return new MatrixJNITest();}}, // No purpose
		new Instancer() {
			public GdxTest instance () {
				return new MeshShaderTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new MipMapTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ModelCacheTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new MultitouchTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new MusicTest();
			}
//		}, new Instancer() { public GdxTest instance () { return new NoncontinuousRenderingTest(); } // FIXME doesn't compile due to the use of Thread
		}, new Instancer() {
			public GdxTest instance () {
				return new ParallaxTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ParticleEmitterTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new PixelsPerInchTest();
			}
		},
// new Instancer() {public GdxTest instance(){return new PixmapBlendingTest();}}, // FIXME no idea why this doesn't work
		new Instancer() {
			public GdxTest instance () {
				return new ProjectiveTextureTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new RotationTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ReflectionCorrectnessTest();
			}
		},
// new Instancer() {public GdxTest instance(){return new RunnablePostTest();}}, // Goes into infinite loop
// new Instancer() {public GdxTest instance(){return new ScrollPaneTest();}}, // FIXME this messes up stuff, why?
// new Instancer() {public GdxTest instance(){return new ShaderMultitextureTest();}}, // FIXME fucks up stuff
		new Instancer() {
			public GdxTest instance () {
				return new ShadowMappingTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ShapeRendererTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SimpleAnimationTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SimpleDecalTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SimpleStageCullingTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SortedSpriteTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SpriteBatchShaderTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SpriteCacheOffsetTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SpriteCacheTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SoundTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new StageTest();
			}
		},
// new Instancer() {public GdxTest instance(){return new StagePerformanceTest();}}, // FIXME borks out
		new Instancer() {
			public GdxTest instance () {
				return new TableTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new TextButtonTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new TextButtonTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new TextureAtlasTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new UITest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new VertexBufferObjectShaderTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new YDownTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new SuperKoalio();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new ReflectionTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new TiledMapAtlasAssetManagerTest();
			}
		}, new Instancer() {
			public GdxTest instance () {
				return new TimeUtilsTest();
			}
		}, new Instancer() {
			public GdxTest instance() {
				return new GWTLossyPremultipliedAlphaTest();
			}
		}};
}