package com.mygame.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Display {
	private JFrame jFrame;
	private Canvas canvas;
	private String title;
	private int width;
	private int height;

	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}

	private void createDisplay(){
		jFrame = new JFrame(title);
		jFrame.setSize(width, height);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));

		jFrame.add(canvas);
		jFrame.pack();
	}
}
