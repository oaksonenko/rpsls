package org.rspsls.action;

public class Game {
	
	int winner = 0;
	
	public void findWinner(Player pl1, Player pl2) {
		int res = (pl1.getChoise() - pl2.getChoise());
		//���� ��������� ������������� ����� ��������� 5
		if(res < 0) {
			res += 5;
			}
		//���� ��������� 0 ����� �����, ���� ������ 0 ���� ����������
		if (res > 0) {
			if (res > 2) {
				winner = 1; // ������� pl1	
			} else {
				winner = 2; // ������� pl2
			}
		}
	}
	
	public void showWinner(Player pl1, Player pl2) {
		findWinner(pl1, pl2);
		switch(winner) {
		case 0:
			System.out.println( pl1.getName() + " and " + pl2.getName() + " tie!");
			break;
		case 1:
			System.out.println(pl1.getName() + " wins!");
			break;
		case 2:
			System.out.println(pl2.getName() + " wins!");
		}
	}

}
