package com.dsburroughs.fantasyfootball.draft.data.parsing;

import com.dsburroughs.fantasyfootball.players.Player;
import com.dsburroughs.fantasyfootball.players.Position;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FantasyProsProjectionParser implements IProjectionParser {

    private static final String QB_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/qb.php?export=xls";
    private static final String RB_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/rb.php?export=xls";
    private static final String WR_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/wr.php?export=xls";
    private static final String TE_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/te.php?export=xls";
    private static final String K_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/k.php?export=xls";
    private static final String DEF_PROJECTION_LINK = "";
    private static final int LINES_TO_SKIP = 6;

    private boolean writeToFile = false;

    public FantasyProsProjectionParser() {

    }

    private List<String> retriveData(String projectionLink) throws IOException {

        List<String> playerData = new ArrayList<String>();

        InputStream input = new URL(projectionLink).openStream();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(input, "UTF-8"))) {

            // skips header information
            for (int i = 0; i < LINES_TO_SKIP; i++)
                br.readLine();

            for (String line; (line = br.readLine()) != null; ) {
                if (line != null) {
                    playerData.add(line);
                }
            }
        }

        return playerData;

    }

    public List<Player> getQuarterbackList() throws ParseException, IOException {
        List<String> csvPlayers = retriveData(QB_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        for (String playerString : csvPlayers) {
            String[] split = playerString.split("\t");

            if (split.length == 12) {
                Player tempPlayer = new Player();

                // hand mapped values
                tempPlayer.setName(split[0]);
                tempPlayer.setTeam(split[1]);
                tempPlayer.setPassingAttempts(prepareDouble(split[2]));
                tempPlayer.setPassingCompletions(prepareDouble(split[3]));
                tempPlayer.setPassingYards(prepareDouble(split[4]));
                tempPlayer.setPassingTouchdowns(prepareDouble(split[5]));
                tempPlayer.setInterceptions(prepareDouble(split[6]));
                tempPlayer.setRushingAttempts(prepareDouble(split[7]));
                tempPlayer.setRushingYards(prepareDouble(split[8]));
                tempPlayer.setRushingTouchdowns(prepareDouble(split[9]));
                tempPlayer.setFumbles(prepareDouble(split[10]));
                tempPlayer.setPosition(Position.QB);

                players.add(tempPlayer);
            }
        }

        return players;
    }

    public List<Player> getRunningbackList() throws IOException, ParseException {
        List<String> csvPlayers = retriveData(RB_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        for (String playerString : csvPlayers) {
            String[] split = playerString.split("\t");

            if (split.length == 10) {
                Player tempPlayer = new Player();

                // hand mapped values
                tempPlayer.setName(split[0]);
                tempPlayer.setTeam(split[1]);
                tempPlayer.setRushingAttempts(prepareDouble(split[2]));
                tempPlayer.setRushingYards(prepareDouble(split[3]));
                tempPlayer.setRushingTouchdowns(prepareDouble(split[4]));
                tempPlayer.setReceptions(prepareDouble(split[5]));
                tempPlayer.setRecievingYards(prepareDouble(split[6]));
                tempPlayer.setRecievingTouchdown(prepareDouble(split[7]));
                tempPlayer.setFumbles(prepareDouble(split[8]));
                tempPlayer.setPosition(Position.RB);

                players.add(tempPlayer);
            }
        }

        return players;
    }

    public List<Player> getWideRecieverList() throws IOException, ParseException {
        List<String> csvPlayers = retriveData(WR_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        for (String playerString : csvPlayers) {
            String[] split = playerString.split("\t");

            if (split.length == 10) {
                Player tempPlayer = new Player();

                // hand mapped values
                tempPlayer.setName(split[0]);
                tempPlayer.setTeam(split[1]);
                tempPlayer.setRushingAttempts(prepareDouble(split[2]));
                tempPlayer.setRushingYards(prepareDouble(split[3]));
                tempPlayer.setRushingTouchdowns(prepareDouble(split[4]));
                tempPlayer.setReceptions(prepareDouble(split[5]));
                tempPlayer.setRecievingYards(prepareDouble(split[6]));
                tempPlayer.setRecievingTouchdown(prepareDouble(split[7]));
                tempPlayer.setFumbles(prepareDouble(split[8]));
                tempPlayer.setPosition(Position.WR);

                players.add(tempPlayer);
            }
        }

        return players;
    }

    public List<Player> getTightEndList() throws IOException, ParseException {
        List<String> csvPlayers = retriveData(TE_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        for (String playerString : csvPlayers) {
            String[] split = playerString.split("\t");

            if (split.length == 10) {
                Player tempPlayer = new Player();

                // hand mapped values
                tempPlayer.setName(split[0]);
                tempPlayer.setTeam(split[1]);
                tempPlayer.setRushingAttempts(prepareDouble(split[2]));
                tempPlayer.setRushingYards(prepareDouble(split[3]));
                tempPlayer.setRushingTouchdowns(prepareDouble(split[4]));
                tempPlayer.setReceptions(prepareDouble(split[5]));
                tempPlayer.setRecievingYards(prepareDouble(split[6]));
                tempPlayer.setRecievingTouchdown(prepareDouble(split[7]));
                tempPlayer.setFumbles(prepareDouble(split[8]));
                tempPlayer.setPosition(Position.TE);

                players.add(tempPlayer);
            }
        }

        return players;
    }

    public List<Player> getKickerList() throws IOException, ParseException {
        List<String> csvPlayers = retriveData(K_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        for (String playerString : csvPlayers) {
            String[] split = playerString.split("\t");

            if (split.length == 10) {
                Player tempPlayer = new Player();

                // hand mapped values
                tempPlayer.setName(split[0]);
                tempPlayer.setTeam(split[1]);
                tempPlayer.setRushingAttempts(prepareDouble(split[2]));
                tempPlayer.setRushingYards(prepareDouble(split[3]));
                tempPlayer.setRushingTouchdowns(prepareDouble(split[4]));
                tempPlayer.setReceptions(prepareDouble(split[5]));
                tempPlayer.setRecievingYards(prepareDouble(split[6]));
                tempPlayer.setRecievingTouchdown(prepareDouble(split[7]));
                tempPlayer.setFumbles(prepareDouble(split[8]));
                tempPlayer.setPosition(Position.K);

                players.add(tempPlayer);
            }
        }

        return players;
    }

    public List<Player> getDefenseList() throws IOException {
        // List<String> csvPlayers = retriveData(DEF_PROJECTION_LINK);
        List<Player> players = new ArrayList<Player>();

        return players;
    }

    public boolean isWriteToFile() {
        return writeToFile;
    }

    public void setWriteToFile(boolean value) {
        writeToFile = value;
    }

    private double prepareDouble(String input) throws ParseException {

        NumberFormat format = NumberFormat.getInstance(Locale.US);
        Number number = format.parse(input);

        return number.doubleValue();
    }

    public List<Player> getRoster() throws Exception {

        List<Player> players = new ArrayList<>();
        players.addAll(getQuarterbackList());
        players.addAll(getRunningbackList());
        players.addAll(getWideRecieverList());
        players.addAll(getTightEndList());
        players.addAll(getDefenseList());
        players.addAll(getKickerList());

        return players;
    }
}
