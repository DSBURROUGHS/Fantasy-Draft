package com.dsburroughs.fantasyfootball.draft.runtime;

import com.dsburroughs.fantasyfootball.draft.data.parsing.FantasyProsProjectionParser;
import com.dsburroughs.fantasyfootball.players.Player;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;

//github.com/DSBURROUGHS/Fantasy-Draft.git

public class ProjectionParserRuntime {

    public static void main(String[] args) throws IOException, URISyntaxException, ParseException {

        FantasyProsProjectionParser parser = new FantasyProsProjectionParser();

        List<Player> player = parser.getQuarterbackList();
        System.out.println(player.get(0));
    }

}
