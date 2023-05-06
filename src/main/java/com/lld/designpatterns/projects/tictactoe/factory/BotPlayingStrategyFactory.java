package com.lld.designpatterns.projects.tictactoe.factory;

import com.lld.designpatterns.projects.tictactoe.models.BotDifficultyLevel;
import com.lld.designpatterns.projects.tictactoe.strategy.BotPlayingStrategy;
import com.lld.designpatterns.projects.tictactoe.strategy.RandomPlayingStrategy;

public class BotPlayingStrategyFactory {
	
	
	// As of now for all the difficulty levels our bot will play randomly
	public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
		switch(botDifficultyLevel) {
		case EASY:
		case MEDIUM:
		case HARD:
		default:
			return new RandomPlayingStrategy();
		}
		
		
	}
}
