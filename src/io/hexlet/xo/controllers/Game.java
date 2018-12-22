package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Player;

public class Game {

	public static final String GAME_NAME = "game XO";

	private Player[] players;

	public Player currentPlayer() {
		return null;
	}

	public String getGameName() {
		return GAME_NAME;
	}

	public Player[] getPlayers() {
		return players;
	}

	public boolean move(final int x, final int y) {
		return false;
 	}

}