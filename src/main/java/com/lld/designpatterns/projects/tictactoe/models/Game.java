package com.lld.designpatterns.projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import com.lld.designpatterns.projects.tictactoe.exceptions.CustomGameValidation;
import com.lld.designpatterns.projects.tictactoe.factory.GameWinningStrategyFactory;
import com.lld.designpatterns.projects.tictactoe.strategy.gamewinningstrategy.GameWinningStrategy;

public class Game {
	private Board board;
	private List<Player> players;
	private List<Move> moves;
	private int nextPlayerIndex;
	private GameStatus gameStatus;
	private Player winner;
	private GameWinningStrategy gameWinningStrategy;

	private Game() {}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public int getNextPlayerIndex() {
		return nextPlayerIndex;
	}

	public void setNextPlayerIndex(int nextPlayerIndex) {
		this.nextPlayerIndex = nextPlayerIndex;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public GameWinningStrategy getGameWinningStrategy() {
		return gameWinningStrategy;
	}

	public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
		this.gameWinningStrategy = gameWinningStrategy;
	}

	
	public static GameBuilder builder() {
		return new GameBuilder();
	}

	public void undo() {
		
	}
	
	public void makeNextMove() {
		
	}
	
	public static class GameBuilder {
		private int dimension;
		private List<Player> players;

		private GameBuilder() {

		}

		public int getDimension() {
			return dimension;
		}

		public List<Player> getPlayers() {
			return players;
		}

		public boolean validate() {
			if (this.dimension < 3)
				throw new CustomGameValidation("Please provide the board size greater than 1");
			if (this.players.size() < dimension - 1)
				throw new CustomGameValidation("Players should be board dimension - 1");

			return true;

		}

		public Game build() {
			try {
				validate();
			} catch (Exception e) {
				throw new CustomGameValidation(e.getMessage());
			}

			Game game = new Game();
			game.setBoard(new Board(dimension));
			game.setPlayers(players);
			game.setGameStatus(GameStatus.INPROGRESS);
			game.setMoves(new ArrayList<Move>());
			game.setNextPlayerIndex(0);
			game.setGameWinningStrategy(GameWinningStrategyFactory.getGameWinningStrategy()); // Have to create strategy
			return game;

		}

	}
}
