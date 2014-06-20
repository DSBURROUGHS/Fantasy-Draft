package com.dsburroughs.fantasyfootball.runtime;

import java.io.IOException;

import com.dsburroughs.fantasyfootball.data.parsing.FantasyProsProjectionParser;
import com.dsburroughs.fantasyfootball.data.parsing.FormatChangeException;
import com.dsburroughs.fantasyfootball.players.Player;

public class ProjectionParserRuntime {

	public static void main(String[] args) throws IOException, FormatChangeException {

		FantasyProsProjectionParser parser = new FantasyProsProjectionParser();

		for (Player p : parser.getQuarterbackList())
			System.out.println(p);
	}

}
