package com.lld.designpatterns.projects.tictactoe.strategy.gamewinningstrategy;

import com.lld.designpatterns.projects.tictactoe.models.Board;
import com.lld.designpatterns.projects.tictactoe.models.Cell;
import com.lld.designpatterns.projects.tictactoe.models.Player;

public interface GameWinningStrategy {
 boolean updateBoardAndCheckWinner(Player lastMovePlayer, Board board, Cell moveCell);
}
