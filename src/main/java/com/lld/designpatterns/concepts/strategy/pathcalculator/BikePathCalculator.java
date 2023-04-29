package com.lld.designpatterns.concepts.strategy.pathcalculator;

public class BikePathCalculator implements PathCalculator{
	private static BikePathCalculator bikePathCalculator;

	private BikePathCalculator() {
	}

	public static BikePathCalculator getInstance() {
		if (bikePathCalculator == null) {
			synchronized (BikePathCalculator.class) {
				if (bikePathCalculator == null)
					bikePathCalculator = new BikePathCalculator();
			}
		}
		return bikePathCalculator;
	}
	@Override
	public void pathCalculator(String source, String destination) {
		System.out.println("Mode : BikePath " + " Source: " + source + " Destination: "+ destination);
		
	}

}