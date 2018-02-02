package com.mygame.states;

import com.mygame.gfx.Assets;
import com.mygame.make.Handler;
import com.mygame.ui.ClickListener;
import com.mygame.ui.UIImageButton;
import com.mygame.ui.UIManager;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class MenuStates extends States {
	private UIManager uiManager;

	public MenuStates(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.btn_start, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				States.setState(handler.getGame().gameState);
			}
		}));
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}
}
