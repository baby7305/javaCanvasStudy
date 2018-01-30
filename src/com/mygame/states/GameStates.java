package com.mygame.states;

import com.mygame.entities.creatures.Player;
import com.mygame.make.Game;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class GameStates extends States {
	private Player player;

	public GameStates(Game game) {
		super(game);
		player = new Player(game, 100, 100);
	}

	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

}
