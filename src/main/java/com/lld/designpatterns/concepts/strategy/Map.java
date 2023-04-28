package com.lld.designpatterns.concepts.strategy;

import com.lld.designpatterns.concepts.strategy.factory.PathCalculatorFactory;
import com.lld.designpatterns.concepts.strategy.pathcalculator.PathCalculator;

public class Map {
	public static void main(String[] args) {
		PathCalculator path = PathCalculatorFactory.getPathCalculator(SupportableMode.CAR);
		path.pathCalculator("AGRA", "DELHI");
	}
}
