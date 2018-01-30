package com.mygame.gfx;

import java.awt.image.BufferedImage;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Assets {
	private static final int width = 32, height = 32;

	public static BufferedImage player, dirt, grass, stone, tree;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/sheet.png"));

		player = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		tree = sheet.crop(0, height, width, height);
	}
}
