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

	private Game() {
	}

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

	@Override
	public String toString() {
		return "Game [board=" + board + ", players=" + players + ", moves=" + moves + ", nextPlayerIndex="
				+ nextPlayerIndex + ", gameStatus=" + gameStatus + ", winner=" + winner + ", gameWinningStrategy="
				+ gameWinningStrategy + "]";
	}

	public void undo() {

	}

	public void makeNextMove() {
		Player player = players.get(nextPlayerIndex);
		System.out.println("This is Player " + player.getName() + "'s turn");
		Move move = player.decideMove(this.getBoard());
		Cell cell = move.getCell();
		int row = cell.getRow();
		int column = cell.getColumn();

		System.out.println("you have moved to " + row + " row, " + column + " column");

		if (cell.getState().equals(CellState.BLOCKED) || cell.getState().equals(CellState.FILLED)) {
			System.out.println("The move to " + row + " row, " + column + " column is not valid. Please try again");
			makeNextMove();
		} else {
//			cell.setState(CellState.FILLED);
//			cell.setPlayer(player);
			this.board.getBoard().get(row).get(column).setState(CellState.FILLED);
			this.board.getBoard().get(row).get(column).setPlayer(player);
		}

		// To maintain final move separetly
		Move finalMove = new Move(move.getPlayer(), board.getBoard().get(row).get(column));
		this.moves.add(finalMove);
		
		if (this.gameWinningStrategy.updateBoardAndCheckWinner(player, this.getBoard(), finalMove.getCell())) {
			this.setWinner(player);
			this.setGameStatus(GameStatus.ENDED);

		}
		nextPlayerIndex++;
		nextPlayerIndex %= players.size();
	}

	public void display() {
		this.getBoard().display();
	}

	public static class GameBuilder {
		private int dimension;
		private List<Player> players;

		private GameBuilder() {

		}

		public GameBuilder setDimension(int dimension) {
			this.dimension = dimension;
			return this;
		}

		public GameBuilder setPlayers(List<Player> players) {
			this.players = players;
			return this;
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
			game.setGameWinningStrategy(GameWinningStrategyFactory.getGameWinningStrategy(dimension)); // Have to create strategy
			return game;

		}

	}
}
