package com.lld.designpatterns.projects.tictactoe.strategy.botplayingstrategy;

import com.lld.designpatterns.projects.tictactoe.models.Board;
import com.lld.designpatterns.projects.tictactoe.models.Move;
import com.lld.designpatterns.projects.tictactoe.models.Player;

public interface BotPlayingStrategy {
	Move decideMove(Player player, Board board);
}
