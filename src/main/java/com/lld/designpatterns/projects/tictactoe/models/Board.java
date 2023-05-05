package com.lld.designpatterns.projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<List<Cell>> board;

	public List<List<Cell>> getBoard() {
		return board;
	}

	public void setBoard(List<List<Cell>> board) {
		this.board = board;
	}

	public Board(int dimension) {
		for (int i = 0; i < dimension; i++) {
			this.board.add(new ArrayList<Cell>());
			for (int j = 0; j < dimension; j++) {
				this.board.get(i).add(new Cell(i, j));
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.size(); j++) {
				if(board.get(i).get(j).state == CellState.EMPTY)
					System.out.println("|  |");
				else if(board.get(i).get(j).state == CellState.BLOCKED)
					System.out.println("| XXX |");
				else
					System.out.println("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
			}
		}
	}
}
