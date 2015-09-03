package org.rspsls.action;

public class Player {
	
	private String name;
	
	private int choise;
	
	public Player( String name, int choise) {
		this.name = name;
		this.choise = choise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChoise() {
		return choise;
	}

	public void setChoise(int choise) {
		this.choise = choise;
	}

}
