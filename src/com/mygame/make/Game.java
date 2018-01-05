package com.mygame.make;

import com.mygame.view.Display;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Game {
	private Display display;

	public int width, height;

	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;

		display = new Display(title, width, height);
	}
}
