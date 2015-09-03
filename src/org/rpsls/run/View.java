package org.rpsls.run;

import org.rspsls.action.Game;
import org.rspsls.action.Player;

public class View {

	public static void main (String [] args) {
		Player pl1 = new Player("Vasya", 3);
		Player pl2 = new Player("Tolya", 2);
		Game g1 = new Game(pl1, pl2);
		ShowWinner.show(g1.findWinner(), pl1.getName(), pl2.getName());
	}
}
