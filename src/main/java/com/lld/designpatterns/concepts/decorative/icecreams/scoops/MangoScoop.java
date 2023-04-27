package com.lld.designpatterns.concepts.decorative.icecreams.scoops;

import com.lld.designpatterns.concepts.decorative.icecreams.Icecream;

public class MangoScoop implements Icecream {
	Icecream icecream;
	int cost;
	String desc;

	public MangoScoop(Icecream icecream) {
		this.icecream = icecream;
		this.cost = 25;
		this.desc = "Mango Scoop";
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