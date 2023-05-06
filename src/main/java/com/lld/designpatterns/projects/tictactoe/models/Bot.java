package com.lld.designpatterns.projects.tictactoe.models;

import com.lld.designpatterns.projects.tictactoe.factory.BotPlayingStrategyFactory;
import com.lld.designpatterns.projects.tictactoe.strategy.BotPlayingStrategy;

public class Bot extends Player {
	private BotDifficultyLevel botDifficultyLevel;
	private BotPlayingStrategy botPlayingStrategy;

	public BotDifficultyLevel getBotDifficultyLevel() {
		return botDifficultyLevel;
	}

	public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
		this.botDifficultyLevel = botDifficultyLevel;
	}

	public BotPlayingStrategy getBotPlayingStrategy() {
		return botPlayingStrategy;
	}

	public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
		this.botPlayingStrategy = botPlayingStrategy;
	}

	public Bot(char symbol, String name, BotDifficultyLevel botDifficultyLevel) {
		super(symbol, name, PlayerType.BOT);
		this.botDifficultyLevel = botDifficultyLevel;
		this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);

	}
	
	@Override
	public Move decideMove(Board board){
		return this.botPlayingStrategy.decideMove(this, board);
	}
}
