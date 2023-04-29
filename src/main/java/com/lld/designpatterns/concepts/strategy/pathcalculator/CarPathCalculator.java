package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class CarPathCalculator implements PathCalculator {

	private static CarPathCalculator carPathCalculator;

	private CarPathCalculator() {
	}

	public static CarPathCalculator getInstance() {
		if (carPathCalculator == null) {
			synchronized (CarPathCalculator.class) {
				if (carPathCalculator == null)
					carPathCalculator = new CarPathCalculator();
			}
		}
		return carPathCalculator;
	}

	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : CarPath" + " Source: " + source + " Destination: " + destination);
	}

}
