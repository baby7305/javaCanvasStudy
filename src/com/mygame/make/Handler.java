package com.mygame.make;

import com.mygame.gfx.GameCamera;
import com.mygame.input.KeyManager;
import com.mygame.input.MouseManager;
import com.mygame.worlds.World;

/**
 * Created by Administrator on 2018/1/31.
 */
public class Handler {
	private Game game;
	private World world;

	public Handler(Game game) {
		this.game = game;
	}

	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}

	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}

	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}

	public int getWidth() {
		return game.getWidth();
	}

	public int getHeight() {
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
