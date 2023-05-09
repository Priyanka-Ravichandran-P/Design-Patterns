package com.lld.designpatterns.projects.tictactoe.models;

import java.util.ArrayList;

public class Board {
	private ArrayList<ArrayList<Cell>> board;

	public ArrayList<ArrayList<Cell>> getBoard() {
		return board;
	}

	public void setBoard(ArrayList<ArrayList<Cell>> board) {
		this.board = board;
	}

	public Board(int dimension) {
		this.board = new ArrayList<ArrayList<Cell>>();
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
					System.out.print("|   |");
				else if(board.get(i).get(j).state == CellState.BLOCKED)
					System.out.print("| XXX |");
				else
					System.out.print("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
			}
			System.out.println();
		}
	}
}
