package com.jaybee291998.rain.level.tile;

import com.jaybee291998.rain.graphics.Screen;
import com.jaybee291998.rain.graphics.Sprite;

public class GrassTile extends Tile{
	
	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
//		screen.pixels[x + y * screen.width] = sprite.pixels[(x&sprite.SIZE-1) + (y&sprite.SIZE-1)*sprite.SIZE];
		screen.renderTile(x, y, this);
	}
}
