package com.dsburroughs.fantasyfootball.data.analysis;

import com.dsburroughs.fantasyfootball.data.configuration.LeagueConfiguration;
import com.dsburroughs.fantasyfootball.players.Player;

public class FantasyPointsCalculator {

	private LeagueConfiguration configuration;

	public FantasyPointsCalculator(LeagueConfiguration configuration) {
		this.configuration = configuration;
	}

	public double calculateProjectedPoints(Player player) {

		boolean fractional = configuration.isFractionalPoints();

		double passingPoints = calculatePassingPoints(player.getPassingYards(), player.getPassingTouchdowns(), player.getInterceptions());
		double rushingPoints = calculateRushingPoints(player.getRushingYards(), player.getRushingTouchdowns(), player.getFumbles());
		double recievingPoints = calculateRecievingPoints(player.getRecievingYards(), player.getReceptions(), player.getRecievingTouchdown());

		if (!fractional) {
			passingPoints = (int) passingPoints;
			rushingPoints = (int) rushingPoints;
			recievingPoints = (int) recievingPoints;
		}

		double totalPoints = passingPoints + rushingPoints + recievingPoints;

		return totalPoints;
	}

	private double calculatePassingPoints(double yards, double touchdowns, double interceptions) {

		double points = yards * configuration.getPointsPerPassingYard() + touchdowns * configuration.getPointsPerPassingTouchdown() + interceptions * configuration.getPointsPerInterception();

		return points;
	}

	private double calculateRushingPoints(double yards, double rushingTouchdowns, double fumbles) {

		double points = yards * configuration.getPointsPerRushingYard() + rushingTouchdowns * configuration.getPointsPerRushingTouchdown() + fumbles * configuration.getPointsPerFumble();

		return points;
	}

	private double calculateRecievingPoints(double yards, double receptions, double recievingTouchdowns) {

		double points = receptions * configuration.getPointsPerReception() + yards * configuration.getPointsPerRecievingYard() + recievingTouchdowns * configuration.getPointsPerRecievingTouchdown();

		return points;
	}

	private double calculateSpecialTeamsPoints(double conversions, double returnYards) {

		double points = conversions * configuration.getPointsPerConversion() + returnYards * configuration.getPointsPerReturnYard();

		return points;
	}

}
