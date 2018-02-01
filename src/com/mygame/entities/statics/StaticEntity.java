package com.mygame.entities.statics;

import com.mygame.entities.Entity;
import com.mygame.make.Handler;

/**
 * Created by Administrator on 2018/2/1.
 */
public abstract class StaticEntity extends Entity {

	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

}
