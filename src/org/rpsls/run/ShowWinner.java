package org.rpsls.run;

public class ShowWinner {
	
	public static void show(int setWinner, String namePlayer1, String namePlayer2 ) {
		switch(setWinner) {
		case 0:
			System.out.println( namePlayer1 + " and " + namePlayer2 + " tie!");
			break;
		case 1:
			System.out.println(namePlayer1 + " wins!");
			break;
		case 2:
			System.out.println(namePlayer2 + " wins!");
		}
	}

}
