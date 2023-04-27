package com.lld.designpatterns.concepts.decorative.icecreams.cones;

import com.lld.designpatterns.concepts.decorative.icecreams.Icecream;

public class ChocolateCone implements Icecream {
	Icecream icecream;
	int cost;
	String desc;

	public ChocolateCone() {
		this.cost = 10;
		this.desc = "Chocolate Cone";
	}

	public ChocolateCone(Icecream icecream) {
		this.icecream = icecream;
		this.cost = 10;
		this.desc = "Chocolate Cone";
	}

	@Override
	public int getCost() throws Exception {
		if (this.icecream == null)
			return this.cost;
		return icecream.getCost() + this.cost;
	}

	@Override
	public String getDescription() throws Exception {
		if (this.icecream == null)
			return this.desc + " ";
		return icecream.getDescription() + this.desc + " ";
	}

}
