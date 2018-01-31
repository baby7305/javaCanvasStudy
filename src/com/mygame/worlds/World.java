package com.mygame.worlds;

import com.mygame.tiles.Tiles;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/31.
 */
public class World {
	private int width, height;
	private int[][] tiles;

	public World(String path) {
		loadWorld(path);
	}

	public void tick() {

	}

	public void render(Graphics g) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				getTile(x, y).render(g, x * Tiles.TILEWIDTH, y * Tiles.TILEHEIGHT);
			}
		}
	}

	public Tiles getTile(int x, int y) {
		Tiles t = Tiles.tiles[tiles[x][y]];
		if (t == null)
			return Tiles.dirtTile;
		return t;
	}

	private void loadWorld(String path) {
		width = 5;
		height = 5;
		tiles = new int[width][height];

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				tiles[x][y] = 1;
			}
		}

	}
}
