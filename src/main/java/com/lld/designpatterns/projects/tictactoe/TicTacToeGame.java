package com.lld.designpatterns.projects.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lld.designpatterns.projects.tictactoe.controller.GameController;
import com.lld.designpatterns.projects.tictactoe.models.Bot;
import com.lld.designpatterns.projects.tictactoe.models.BotDifficultyLevel;
import com.lld.designpatterns.projects.tictactoe.models.Game;
import com.lld.designpatterns.projects.tictactoe.models.GameStatus;
import com.lld.designpatterns.projects.tictactoe.models.Player;
import com.lld.designpatterns.projects.tictactoe.models.PlayerType;

public class TicTacToeGame {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the board Dimension");
		int dimension = scanner.nextInt();
		System.out.println("Will there be any bot player ? Y/N");
		String isBotPlayer = scanner.next();
		int toIterate = dimension - 1; // If dimension is 3, then player should be 2
		if (isBotPlayer.equals("Y"))
			toIterate = dimension - 2;
		List<Player> players = new ArrayList<>();
		for (int i = 0; i < toIterate; i++) {
			System.out.println("What is the name of player " + i);
			String playerName = scanner.next();
			System.out.println("What is the symbol of player " + i);
			String playerSymbol = scanner.next();

			players.add(new Player(playerSymbol.charAt(0), playerName, PlayerType.HUMAN));
		}

		if (isBotPlayer.equals("Y")) {
			System.out.println("What is the name of bot ");
			String botName = scanner.next();
			System.out.println("What is the symbol of bot ");
			String botSymbol = scanner.next();
			players.add(new Bot(botSymbol.charAt(0), botName, BotDifficultyLevel.EASY));
		}
		scanner.close();
		GameController gameController = new GameController();
		Game game = gameController.createGame(dimension, players);

		while (gameController.getGameStatus(game).equals(GameStatus.INPROGRESS)) {
			System.out.println("This is the board size");
			gameController.displayBoard(game);
			System.out.println("Play your next move");
			gameController.executeNextMove(game);
		}

		System.out.println("Result of the Game is");

		if (!gameController.getGameStatus(game).equals(GameStatus.DRAW)) {
			System.out.println("The Winner is " + gameController.getWinner(game).getName());
			gameController.displayBoard(game);
		} else {
			System.out.println("The Match is Draw ");
		}

	}

}
