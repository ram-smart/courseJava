package io.hexlet.xo.view;
import io.hexlet.xo.controllers.Game;

public class ConsoleView {
	private final Game game;

	public ConsoleView(Game game) {
		this.game = game;
	}

	public void showGameName () {
		System.out.println(game.getGameName());
	}

	public void showPlayersName(game) {
		System.out.println(game.getPlayers());
	}

}