package com.mygame.states;

import com.mygame.make.Handler;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public abstract class States {
	private static States currentState = null;

	public static void setState(States state) {
		currentState = state;
	}

	public static States getState() {
		return currentState;
	}

	//CLASS

	protected Handler handler;

	public States(Handler handler) {
		this.handler = handler;
	}

	public abstract void tick();

	public abstract void render(Graphics g);
}
