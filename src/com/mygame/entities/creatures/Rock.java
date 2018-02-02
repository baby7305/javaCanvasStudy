package com.mygame.entities.creatures;

import com.mygame.entities.statics.StaticEntity;
import com.mygame.gfx.Assets;
import com.mygame.make.Handler;
import com.mygame.tiles.Tiles;

import java.awt.*;

/**
 * Created by Administrator on 2018/2/2.
 */
public class Rock extends StaticEntity {

	public Rock(Handler handler, float x, float y) {
		super(handler, x, y, Tiles.TILEWIDTH, Tiles.TILEHEIGHT);

		bounds.x = 3;
		bounds.y = (int) (height / 2f);
		bounds.width = width - 6;
		bounds.height = (int) (height - height / 2f);
	}

	@Override
	public void tick() {

	}

	@Override
	public void die() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.rock, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
