package com.lld.designpatterns.concepts.decorative.icecreams.syrups;

import com.lld.designpatterns.concepts.decorative.icecreams.Icecream;

public class BlueberrySyrup implements Icecream {
	Icecream icecream;
	int cost;
	String desc;

	public BlueberrySyrup(Icecream icecream) {
		this.icecream = icecream;
		this.cost = 20;
		this.desc = "Blueberry Syrup";
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