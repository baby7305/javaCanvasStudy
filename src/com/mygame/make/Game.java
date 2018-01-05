package com.mygame.make;

import com.mygame.view.Display;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;

	private boolean running;
	private Thread thread;

	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		running = false;
	}

	private void init(){
		display = new Display(title, width, height);
	}

	private void tick(){

	}

	private void render(){

	}

	public void run(){

		init();

		while(running){
			tick();
			render();
		}

		stop();

	}

	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
