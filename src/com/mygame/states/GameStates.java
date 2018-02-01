package com.mygame.states;

import com.mygame.entities.creatures.Player;
import com.mygame.make.Handler;
import com.mygame.statics.Tree;
import com.mygame.worlds.World;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class GameStates extends States {
	private Player player;
	private World world;
	private Tree tree;

	public GameStates(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		tree = new Tree(handler, 100, 200);
	}

	@Override
	public void tick() {
		world.tick();
		player.tick();
		tree.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
		tree.render(g);
	}

}
