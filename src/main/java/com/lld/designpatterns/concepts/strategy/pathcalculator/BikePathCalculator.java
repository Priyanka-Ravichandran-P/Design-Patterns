package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class BikePathCalculator implements PathCalculator{

	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : BikePath" + " Source: " + source + " Destination: "+ destination);
		
	}

}