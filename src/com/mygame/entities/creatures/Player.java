package com.mygame.entities.creatures;

import com.mygame.gfx.Assets;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Player extends Creature {
	public Player(float x, float y) {
		super(x, y);
	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, null);
	}
}
