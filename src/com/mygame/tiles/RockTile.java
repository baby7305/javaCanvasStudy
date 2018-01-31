package com.mygame.tiles;

import com.mygame.gfx.Assets;

/**
 * Created by Administrator on 2018/1/31.
 */
public class RockTile extends Tiles {

	public RockTile(int id) {
		super(Assets.stone, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}

}
