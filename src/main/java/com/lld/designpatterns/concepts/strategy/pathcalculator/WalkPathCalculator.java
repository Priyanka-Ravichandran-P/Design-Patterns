package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class WalkPathCalculator implements PathCalculator {
	private static WalkPathCalculator walkPathCalculator;

	private WalkPathCalculator() {
	}

	public static WalkPathCalculator getInstance() {
		if (walkPathCalculator == null) {
			synchronized (WalkPathCalculator.class) {
				if (walkPathCalculator == null)
					walkPathCalculator = new WalkPathCalculator();
			}
		}
		return walkPathCalculator;
	}

	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : WalkPath" + " Source: " + source + " Destination: " + destination);

	}

}