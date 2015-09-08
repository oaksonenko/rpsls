package org.rpsls.run;

import org.rspsls.action.Game;
import org.rspsls.action.Player;

public class View {

	public static void main (String [] args) {
/*		Player pl1 = new Player("Vasya", 4);
		Player pl2 = new Player("Tolya", 4);
		Game2 game = new Game2();
		game.showWinner(pl1, pl2);*/
		new Game().showWinner(new Player("Vasya", 2), new Player("Tolya", 3));
	}
}
