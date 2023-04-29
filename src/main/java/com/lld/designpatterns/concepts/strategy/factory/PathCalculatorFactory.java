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
	 if(mode == SupportableMode.CAR) return CarPathCalculator.getInstance();
	 if(mode == SupportableMode.BIKE) return BikePathCalculator.getInstance();
	 if(mode == SupportableMode.WALK) return WalkPathCalculator.getInstance();
	 return null;
 }
}
