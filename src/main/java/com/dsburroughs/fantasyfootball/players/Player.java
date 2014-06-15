package com.dsburroughs.fantasyfootball.players;

public class Player {

	private String name;

	private int passingAttempts;
	private int passingCompletions;
	private int passingYards;
	private int passingTouchdowns;

	private int rushingYards;
	private int rushingAttempts;
	private int rushingTouchdowns;

	private int recievingYards;
	private int receptions;
	private int recievingTouchdown;

	private int interceptions;
	private int fumbles;

	private Health health;
	private Position position;

	public enum Position {
		QB, RB, WR, TE, K, DEF
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassingAttempts() {
		return passingAttempts;
	}

	public void setPassingAttempts(int passingAttempts) {
		this.passingAttempts = passingAttempts;
	}

	public int getPassingCompletions() {
		return passingCompletions;
	}

	public void setPassingCompletions(int passingCompletions) {
		this.passingCompletions = passingCompletions;
	}

	public int getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}

	public int getPassingTouchdowns() {
		return passingTouchdowns;
	}

	public void setPassingTouchdowns(int passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}

	public int getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}

	public int getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}

	public int getRushingTouchdowns() {
		return rushingTouchdowns;
	}

	public void setRushingTouchdowns(int rushingTouchdowns) {
		this.rushingTouchdowns = rushingTouchdowns;
	}

	public int getRecievingYards() {
		return recievingYards;
	}

	public void setRecievingYards(int recievingYards) {
		this.recievingYards = recievingYards;
	}

	public int getReceptions() {
		return receptions;
	}

	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}

	public int getRecievingTouchdown() {
		return recievingTouchdown;
	}

	public void setRecievingTouchdown(int recievingTouchdown) {
		this.recievingTouchdown = recievingTouchdown;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getFumbles() {
		return fumbles;
	}

	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
