package com.mygame.states;

import com.mygame.entities.creatures.Player;
import com.mygame.make.Game;
import com.mygame.worlds.World;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class GameStates extends States {
	private Player player;
	private World world;

	public GameStates(Game game) {
		super(game);
		player = new Player(game, 100, 100);
		world = new World("res/worlds/world1.txt");
	}

	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
