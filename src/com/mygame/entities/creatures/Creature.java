package com.mygame.entities.creatures;

import com.mygame.entities.Entity;

/**
 * Created by Administrator on 2018/1/30.
 */
public abstract class Creature extends Entity{
	protected int health;

	public Creature(float x, float y) {
		super(x, y);
		health = 10;
	}
}
