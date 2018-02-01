package com.mygame.statics;

import com.mygame.gfx.Assets;
import com.mygame.make.Handler;
import com.mygame.tiles.Tiles;

import java.awt.*;

/**
 * Created by Administrator on 2018/2/1.
 */
public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tiles.TILEWIDTH, Tiles.TILEHEIGHT * 2);
	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
