package com.dsburroughs.fantasyfootball.runtime;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;

import com.dsburroughs.fantasyfootball.data.parsing.FantasyProsProjectionParser;
//github.com/DSBURROUGHS/Fantasy-Draft.git
import com.dsburroughs.fantasyfootball.players.Player;

public class ProjectionParserRuntime {

	public static void main(String[] args) throws IOException, URISyntaxException, ParseException {

		FantasyProsProjectionParser parser = new FantasyProsProjectionParser();

		List<Player> player = parser.getQuarterbackList();
		System.out.println(player.get(0));
	}

}
