package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class CarPathCalculator implements PathCalculator{

	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : CarPath" + " Source: " + source + " Destination: "+ destination);
	}

}
