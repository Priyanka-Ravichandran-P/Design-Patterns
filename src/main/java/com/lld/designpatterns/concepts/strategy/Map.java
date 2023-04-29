package com.lld.designpatterns.concepts.strategy;

import com.lld.designpatterns.concepts.strategy.factory.PathCalculatorFactory;
import com.lld.designpatterns.concepts.strategy.pathcalculator.PathCalculator;

public class Map {
	public void findPath(String source, String destination, SupportableMode mode) {
		PathCalculator path = PathCalculatorFactory.getPathCalculator(mode);
		path.pathCalculator(source, destination);
	}
}
