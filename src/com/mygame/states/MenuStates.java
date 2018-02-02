package com.mygame.states;

import com.mygame.make.Handler;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class MenuStates extends States {
	public MenuStates(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
//		System.out.println(handler.getMouseManager().getMouseX() + "	" + handler.getMouseManager().getMouseY());
		if (handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed())
			States.setState(handler.getGame().gameState);
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
	}
}
