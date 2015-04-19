package com.dsburroughs.fantasyfootball.draft.runtime;

import com.dsburroughs.fantasyfootball.draft.analysis.FantasyPointsCalculator;
import com.dsburroughs.fantasyfootball.draft.data.parsing.FantasyProsProjectionParser;
import com.dsburroughs.fantasyfootball.draft.league.configuration.LeagueConfiguration;
import com.dsburroughs.fantasyfootball.draft.league.configuration.LeagueConfigurationLoader;
import com.dsburroughs.fantasyfootball.players.Player;

import java.util.List;

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
