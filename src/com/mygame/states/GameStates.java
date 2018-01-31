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
		world = new World(game, "res/worlds/world1.txt");
		game.getGameCamera().move(0, 0);
	}

	@Override
	public void tick() {
		world.tick();
		player.tick();
		game.getGameCamera().move(1, 1);
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
