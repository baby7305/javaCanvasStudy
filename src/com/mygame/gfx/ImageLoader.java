package com.mygame.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/1/30.
 */
public class ImageLoader {
	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(new File(System.getProperty("user.dir") + path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
