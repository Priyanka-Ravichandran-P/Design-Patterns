package com.lld.designpatterns.concepts.decorative.icecreams.scoops;

import com.lld.designpatterns.concepts.decorative.icecreams.Icecream;

public class StrawberryScoop implements Icecream {
	Icecream icecream;
	int cost;
	String desc;

	public StrawberryScoop(Icecream icecream) {
		this.icecream = icecream;
		this.cost = 25;
		this.desc = "Strawberry Scoop";
	}

	@Override
	public int getCost() throws Exception {
		if (this.icecream == null)
			throw new Error("Please first choose cone");
		return icecream.getCost() + this.cost;
	}

	@Override
	public String getDescription() throws Exception {
		if (this.icecream == null)
			throw new Error("Please first choose cone");
		return icecream.getDescription() + this.desc + " ";
	}

}
