package com.lld.designpatterns.projects.tictactoe.strategy;


import com.lld.designpatterns.projects.tictactoe.models.Board;
import com.lld.designpatterns.projects.tictactoe.models.Cell;
import com.lld.designpatterns.projects.tictactoe.models.CellState;
import com.lld.designpatterns.projects.tictactoe.models.Move;
import com.lld.designpatterns.projects.tictactoe.models.Player;

public class RandomPlayingStrategy implements BotPlayingStrategy {

	@Override
	public Move decideMove(Player player, Board board) {
		for (int i = 0; i < board.getBoard().size(); i++) {
			for (int j = 0; j < board.getBoard().size(); j++) {
				if(isEmptyCell(board, i, j)) {
					return new Move(player, new Cell(i,j));
				}
			}
		}
		return null;
	}

	private boolean isEmptyCell(Board board, int i, int j) {
		return board.getBoard().get(i).get(j).getState().equals(CellState.EMPTY);
	}

}
