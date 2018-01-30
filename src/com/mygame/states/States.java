package com.mygame.states;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public abstract class States {
	private static States currentState = null;

	public static void setState(States states){
		currentState = states;
	}

	public static States getState(){
		return currentState;
	}

	//CLASS
	public abstract void tick();

	public abstract void render(Graphics g);
}
