package com.polban.tekpro.monopoly;

public class FreeParkingCell extends Cell {

	private boolean available = true;
	protected Player owner;

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Player getPlayer() {
		return owner;
	}

	public void setPlayer(Player player) {
		this.owner = player;
	}
}
