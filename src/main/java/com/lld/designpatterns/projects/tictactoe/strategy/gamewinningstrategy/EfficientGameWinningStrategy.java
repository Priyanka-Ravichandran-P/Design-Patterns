package com.lld.designpatterns.projects.tictactoe.strategy.gamewinningstrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lld.designpatterns.projects.tictactoe.models.Board;
import com.lld.designpatterns.projects.tictactoe.models.Cell;
import com.lld.designpatterns.projects.tictactoe.models.Player;

public class EfficientGameWinningStrategy implements GameWinningStrategy {
	List<HashMap<Character, Integer>> listOfRowMap = new ArrayList<>();
	List<HashMap<Character, Integer>> listOfColMap = new ArrayList<>();
	HashMap<Character, Integer> topLeftDiagonalMap = new HashMap<>();
	HashMap<Character, Integer> topRightDiagonalMap = new HashMap<>();
	private int dimension;

	public EfficientGameWinningStrategy() {
		for (int i = 0; i < dimension; i++) {
			listOfRowMap.add(new HashMap<Character, Integer>());
			listOfColMap.add(new HashMap<Character, Integer>());
		}
	}

	boolean isTopLeftDiagonal(int row, int col) {
		return row == col;
	}

	boolean isTopRightDiagonal(int row, int col) {
		return row + col == dimension;
	}

	@Override
	public boolean updateBoardAndCheckWinner(Player lastMovePlayer, Board board, Cell movedCell) {

		int row = movedCell.getRow();
		int col = movedCell.getColumn();
		char symbol = lastMovePlayer.getSymbol();

		listOfRowMap.get(row).put(symbol, listOfRowMap.get(row).getOrDefault(symbol, 0) + 1);

		listOfColMap.get(col).put(symbol, listOfColMap.get(col).getOrDefault(symbol, 0) + 1);
		listOfColMap.get(col).put(symbol, listOfColMap.get(col).getOrDefault(symbol, 0) + 1);

		if (isTopLeftDiagonal(row, col))
			topLeftDiagonalMap.put(symbol, topLeftDiagonalMap.getOrDefault(symbol, 0) + 1);

		if (isTopRightDiagonal(row, col))
			topRightDiagonalMap.put(symbol, topRightDiagonalMap.getOrDefault(symbol, 0) + 1);

		return checkWinner(row, col, symbol);
	}

	public boolean checkWinner(int row, int col, char symbol) {

		if (listOfRowMap.get(row).getOrDefault(symbol, 0) == dimension)
			return true;

		if (listOfColMap.get(col).getOrDefault(symbol, 0) == dimension)
			return true;

		if (isTopLeftDiagonal(row, col)) {
			if (topLeftDiagonalMap.getOrDefault(symbol, 0) == dimension)
				return true;
		}

		if (isTopRightDiagonal(row, col)) {
			if (topRightDiagonalMap.getOrDefault(symbol, 0) == dimension)
				return true;
		}

		return false;
	}

}
