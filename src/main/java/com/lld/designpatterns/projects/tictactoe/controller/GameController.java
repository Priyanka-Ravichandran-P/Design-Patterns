package com.lld.designpatterns.projects.tictactoe.controller;

import java.util.List;

import com.lld.designpatterns.projects.tictactoe.models.Game;
import com.lld.designpatterns.projects.tictactoe.models.GameStatus;
import com.lld.designpatterns.projects.tictactoe.models.Player;

public class GameController {
	public void undo() {

	}

	public Game createGame(int dimension, List<Player> players) {
		try {
			return Game.builder().setDimension(dimension).setPlayers(players).build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public GameStatus getGameStatus(Game game) {
		return game.getGameStatus();
	}

	public void displayBoard(Game game) {
		game.display();
	}

	public void executeNextMove(Game game) {
		game.makeNextMove();
	}

	public Player getWinner(Game game) {
		return game.getWinner();
	}
}
