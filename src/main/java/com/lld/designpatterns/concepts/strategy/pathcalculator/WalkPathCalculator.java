package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class WalkPathCalculator implements PathCalculator{

	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : WalkPath" + " Source: " + source + " Destination: "+ destination);
		
	}

}