package com.badbears.ZombieBird;

import com.badbears.Screens.SplashScreen;
import com.badbears.ZBHelpers.AssetLoader;
import com.badlogic.gdx.Game;

public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}