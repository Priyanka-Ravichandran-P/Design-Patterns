package com.lld.designpatterns.concepts.strategy.factory;

import com.lld.designpatterns.concepts.strategy.SupportableMode;
import com.lld.designpatterns.concepts.strategy.pathcalculator.BikePathCalculator;
import com.lld.designpatterns.concepts.strategy.pathcalculator.CarPathCalculator;
import com.lld.designpatterns.concepts.strategy.pathcalculator.PathCalculator;
import com.lld.designpatterns.concepts.strategy.pathcalculator.WalkPathCalculator;

public class PathCalculatorFactory {
	private PathCalculatorFactory() {
		
	}
	
 public static PathCalculator getPathCalculator(SupportableMode mode) {
	 if(mode == SupportableMode.CAR) return new CarPathCalculator();
	 if(mode == SupportableMode.BIKE) return new BikePathCalculator();
	 if(mode == SupportableMode.WALK) return new WalkPathCalculator();
	 return null;
 }
}
