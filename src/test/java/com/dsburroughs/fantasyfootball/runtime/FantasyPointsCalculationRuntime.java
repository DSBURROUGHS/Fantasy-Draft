package com.dsburroughs.fantasyfootball.runtime;

import java.util.List;

import com.dsburroughs.fantasyfootball.data.analysis.FantasyPointsCalculator;
import com.dsburroughs.fantasyfootball.data.configuration.LeagueConfiguration;
import com.dsburroughs.fantasyfootball.data.configuration.LeagueConfigurationLoader;
import com.dsburroughs.fantasyfootball.data.parsing.FantasyProsProjectionParser;
import com.dsburroughs.fantasyfootball.players.Player;

public class FantasyPointsCalculationRuntime {

	public static void main(String[] args) throws Exception {

		FantasyProsProjectionParser parser = new FantasyProsProjectionParser();
		List<Player> player = parser.getRoster();

		LeagueConfigurationLoader configLoader = new LeagueConfigurationLoader();
		LeagueConfiguration config = configLoader.loadConfiguration("default");

		FantasyPointsCalculator calc = new FantasyPointsCalculator(config);
		System.out.println(player.get(0).getName());
		System.out.println(calc.calculateProjectedPoints(player.get(0)));

	}
}
