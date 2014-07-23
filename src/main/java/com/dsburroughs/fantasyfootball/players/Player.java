package com.dsburroughs.fantasyfootball.players;

public class Player {

	private String name;
	private String team;

	private double passingAttempts;
	private double passingCompletions;
	private double passingYards;
	private double passingTouchdowns;

	private double rushingYards;
	private double rushingAttempts;
	private double rushingTouchdowns;

	private double recievingYards;
	private double receptions;
	private double recievingTouchdown;

	private double interceptions;
	private double fumbles;

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

	public double getPassingAttempts() {
		return passingAttempts;
	}

	public void setPassingAttempts(double passingAttempts) {
		this.passingAttempts = passingAttempts;
	}

	public double getPassingCompletions() {
		return passingCompletions;
	}

	public void setPassingCompletions(double passingCompletions) {
		this.passingCompletions = passingCompletions;
	}

	public double getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(double passingYards) {
		this.passingYards = passingYards;
	}

	public double getPassingTouchdowns() {
		return passingTouchdowns;
	}

	public void setPassingTouchdowns(double passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}

	public double getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(double rushingYards) {
		this.rushingYards = rushingYards;
	}

	public double getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingAttempts(double rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}

	public double getRushingTouchdowns() {
		return rushingTouchdowns;
	}

	public void setRushingTouchdowns(double rushingTouchdowns) {
		this.rushingTouchdowns = rushingTouchdowns;
	}

	public double getRecievingYards() {
		return recievingYards;
	}

	public void setRecievingYards(double recievingYards) {
		this.recievingYards = recievingYards;
	}

	public double getReceptions() {
		return receptions;
	}

	public void setReceptions(double receptions) {
		this.receptions = receptions;
	}

	public double getRecievingTouchdown() {
		return recievingTouchdown;
	}

	public void setRecievingTouchdown(double recievingTouchdown) {
		this.recievingTouchdown = recievingTouchdown;
	}

	public double getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(double interceptions) {
		this.interceptions = interceptions;
	}

	public double getFumbles() {
		return fumbles;
	}

	public void setFumbles(double fumbles) {
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	

	
	
}
