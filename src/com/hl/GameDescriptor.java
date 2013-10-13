package com.hl;

import org.bukkit.block.Sign;

public class GameDescriptor {
	private int actual;
	private int max;
	
	private int redMembers;
	private int blueMembers;

	private Sign lobbySign;
	private Sign redTeamSign;
	private Sign blueTeamSign;
	
	public GameDescriptor(Sign _sign) {
		this.lobbySign = _sign;
	}


	public Sign getLobbySign() {
		return lobbySign;
	}
	
	public void setLobbySign(Sign sign) {
		this.lobbySign = sign;
	}
	public int getRedMembers() {
		return redMembers;
	}
	public void setRedMembers(int redMembers) {
		this.redMembers = redMembers;
	}
	public int getBlueMembers() {
		return blueMembers;
	}
	public void setBlueMembers(int blueMembers) {
		this.blueMembers = blueMembers;
	}
	public int getActual() {
		return actual;
	}
	public void setActual(int actual) {
		this.actual = actual;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Sign getRedTeamSign() {
		return redTeamSign;
	}
	public void setRedTeamSign(Sign redTeamSign) {
		this.redTeamSign = redTeamSign;
	}
	public Sign getBlueTeamSign() {
		return blueTeamSign;
	}

	public void setBlueTeamSign(Sign blueTeamSign) {
		this.blueTeamSign = blueTeamSign;
	}
}
