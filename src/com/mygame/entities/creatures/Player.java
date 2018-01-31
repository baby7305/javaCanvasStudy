package com.mygame.entities.creatures;

import com.mygame.gfx.Assets;
import com.mygame.make.Game;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Player extends Creature {
	private Game game;

	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
	}

	@Override
	public void tick() {
		getInput();
		move();
	}

	private void getInput(){
		xMove = 0;
		yMove = 0;

		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove = speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		if(game.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, width, height, null);
	}
}
