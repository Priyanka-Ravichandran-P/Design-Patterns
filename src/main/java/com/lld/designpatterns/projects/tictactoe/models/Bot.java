package com.lld.designpatterns.projects.tictactoe.models;

import com.lld.designpatterns.projects.tictactoe.factory.BotPlayingStrategyFactory;
import com.lld.designpatterns.projects.tictactoe.strategy.BotPlayingStrategy;

public class Bot extends Player {
	private BotDifficultyLevel botDifficultyLevel;
	private BotPlayingStrategy botPlayingStrategy;

	public Bot(char symbol, String name, BotDifficultyLevel botDifficultyLevel) {
		super(symbol, name, PlayerType.BOT);
		this.botDifficultyLevel = botDifficultyLevel;
		this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);

	}
}
