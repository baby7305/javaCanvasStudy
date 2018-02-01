package com.mygame.worlds;

import com.mygame.entities.EntityManager;
import com.mygame.entities.creatures.Player;
import com.mygame.entities.statics.Tree;
import com.mygame.make.Handler;
import com.mygame.tiles.Tiles;
import com.mygame.utils.Utils;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/31.
 */
public class World {
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	//Entities
	private EntityManager entityManager;

	public World(Handler handler, String path) {
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		entityManager.addEntity(new Tree(handler, 100, 250));
		entityManager.addEntity(new Tree(handler, 100, 350));
		entityManager.addEntity(new Tree(handler, 100, 450));

		loadWorld(path);

		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}

	public void tick() {
		entityManager.tick();
	}

	public void render(Graphics g) {
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tiles.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tiles.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tiles.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tiles.TILEHEIGHT + 1);

		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tiles.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tiles.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}

	public Tiles getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height)
			return Tiles.grassTile;

		Tiles t = Tiles.tiles[tiles[x][y]];
		if (t == null)
			return Tiles.dirtTile;
		return t;
	}

	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);

		tiles = new int[width][height];
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
