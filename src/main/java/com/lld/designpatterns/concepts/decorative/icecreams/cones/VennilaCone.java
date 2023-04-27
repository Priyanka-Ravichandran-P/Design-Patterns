package com.lld.designpatterns.concepts.decorative.icecreams.cones;

import com.lld.designpatterns.concepts.decorative.icecreams.Icecream;

public class VennilaCone implements Icecream {
	Icecream icecream;
	int cost;
	String desc;

	public VennilaCone() {
		this.cost = 10;
		this.desc = "Vennila Cone";
	}

	public VennilaCone(Icecream icecream) {
		this.icecream = icecream;
		this.cost = 10;
		this.desc = "Vennila Cone";
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
