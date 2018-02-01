package com.mygame.states;

import com.mygame.make.Handler;
import com.mygame.worlds.World;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class GameStates extends States {
	private World world;

	public GameStates(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
	}

	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}

}
