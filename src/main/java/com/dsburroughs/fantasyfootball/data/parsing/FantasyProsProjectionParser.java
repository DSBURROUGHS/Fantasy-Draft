package com.dsburroughs.fantasyfootball.data.parsing;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import com.dsburroughs.fantasyfootball.players.Player;

public class FantasyProsProjectionParser implements IProjectionParser {

	public final static String QB_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/qb.php";
	public final static String RB_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/rb.php";
	public final static String WR_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/wr.php";
	public final static String TE_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/te.php";
	public final static String K_PROJECTION_LINK = "http://www.fantasypros.com/nfl/projections/k.php";
	public final static String DEF_PROJECTION_LINK = "";

	private boolean writeToFile = false;

	public FantasyProsProjectionParser() {

	}

	private List<String> parseToCSV(String projectionLink) throws IOException {

		List<String> csvPlayers = new ArrayList<String>();
		StringWriter sw = new StringWriter();
		CSVWriter writer = new CSVWriter(sw);

		Document doc = Jsoup.connect(projectionLink).get();
		Element tableHeader = doc.select("table").get(1);
		Element element = tableHeader.children().get(1);

		for (Element players : element.getElementsByTag("tr")) {
			Elements nodes = players.getElementsByTag("td");
			int nodeCount = nodes.size();

			String[] tempPlayerArray = new String[nodeCount];
			tempPlayerArray[0] = nodes.get(0).text();

			for (int i = 1; i < tempPlayerArray.length; i++) {
				tempPlayerArray[i] = players.getElementsByTag("td").get(i)
						.text();
			}

			writer.writeNext(tempPlayerArray);
			csvPlayers.add(sw.toString());
			System.out.println(sw.toString());
			// clears stringwriter contents for reuse
			sw.getBuffer().setLength(0);
		}
		sw.close();
		writer.close();

		return csvPlayers;
	}

	public List<Player> getQuarterbackList() throws IOException {

		List<String> csvPlayers = parseToCSV(QB_PROJECTION_LINK);
		CSVReader reader = null;

		for (String currentPlayer : csvPlayers) {
			Player tempPlayer = new Player();
			
			reader = new CSVReader(new StringReader(currentPlayer));
			String[] playerValues = reader.readNext();
			
			//hand mapped values from csv
			tempPlayer.setName(playerValues[0]);
//			tempPlayer.set(playerValues[0]);
//			tempPlayer.setName(playerValues[0]);
//			tempPlayer.setName(playerValues[0]);
//			tempPlayer.setName(playerValues[0]);
//			tempPlayer.setName(playerValues[0]);

		}

		return null;
	}

	public List<Player> geRunningbackList() throws IOException {
		List<String> csvPlayers = parseToCSV(RB_PROJECTION_LINK);

		return null;
	}

	public List<Player> getWideRecieverList() throws IOException {
		List<String> csvPlayers = parseToCSV(WR_PROJECTION_LINK);

		return null;
	}

	public List<Player> getTightEndList() throws IOException {
		List<String> csvPlayers = parseToCSV(TE_PROJECTION_LINK);

		return null;
	}

	public List<Player> getKickerList() throws IOException {
		List<String> csvPlayers = parseToCSV(K_PROJECTION_LINK);

		return null;
	}

	public List<Player> getDefenseList() throws IOException {
		List<String> csvPlayers = parseToCSV(DEF_PROJECTION_LINK);

		return null;
	}

	public void setWriteToFile(boolean value) {
		writeToFile = value;
	}

	public boolean getWriteToFile() {
		return writeToFile;
	}
}
