package com.zarkoix.ascfiighter.tile.entity;

import com.zarkoix.ascfiighter.tile.Tile;

import net.slashie.libjcsi.CSIColor;
import lombok.Getter;
import lombok.Setter;

public class Entity extends Tile {
	public Entity(char v, CSIColor m, boolean g, short h, short t, short mh) {
		super(v, m, g);
		hp = h;
		maxHp = mh;
		type = t;
	}
	
	@Getter @Setter private short hp;
	@Getter @Setter private short type;
	@Getter @Setter private short maxHp;
	
}
