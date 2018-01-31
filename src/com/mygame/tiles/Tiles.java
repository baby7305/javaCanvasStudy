package com.mygame.tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Administrator on 2018/1/31.
 */
public class Tiles {
	//STATIC STUFF HERE

	public static Tiles[] tiles = new Tiles[256];
	public static Tiles grassTile = new GrassTile(0);
	public static Tiles dirtTile = new DirtTile(1);
	public static Tiles rockTile = new RockTile(2);

	//CLASS

	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

	protected BufferedImage texture;
	protected final int id;

	public Tiles(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;

		tiles[id] = this;
	}

	public void tick() {

	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}

	public boolean isSolid() {
		return false;
	}

	public int getId() {
		return id;
	}
}
