package com.mygame.entities;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public abstract class Entity {
	protected float x, y;

	public Entity(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public abstract void tick();

	public abstract void render(Graphics g);
}
