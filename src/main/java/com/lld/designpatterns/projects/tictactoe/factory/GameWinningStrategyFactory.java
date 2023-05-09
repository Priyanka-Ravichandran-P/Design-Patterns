package com.lld.designpatterns.projects.tictactoe.factory;

import com.lld.designpatterns.projects.tictactoe.strategy.gamewinningstrategy.EfficientGameWinningStrategy;
import com.lld.designpatterns.projects.tictactoe.strategy.gamewinningstrategy.GameWinningStrategy;

public class GameWinningStrategyFactory {

	public static GameWinningStrategy getGameWinningStrategy(int dimension) {
		return new EfficientGameWinningStrategy(dimension);
	}
}
