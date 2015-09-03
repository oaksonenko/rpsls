package org.rspsls.action;

public class Game {
	
	private Player pl1;
	
	private Player pl2;
	
	private int winner = 0;
	
	public Game(Player pl1, Player pl2) {
		super();
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public int findWinner () {
		int res = (pl1.getChoise() - pl2.getChoise());
		if(res < 5) {
			res += 5;
		}			
		if (res > 0) {
			if (res <= 2) {
				winner = 1; // גûידנאכ pl1	
			} else {
				winner = 2; // גûידנאכ pl2
			}
		}
		return winner;
	}

}

