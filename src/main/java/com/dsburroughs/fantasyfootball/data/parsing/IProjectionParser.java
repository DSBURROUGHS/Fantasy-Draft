package com.dsburroughs.fantasyfootball.data.parsing;

import java.io.IOException;
import java.util.List;

import com.dsburroughs.fantasyfootball.players.Player;

public interface IProjectionParser {

	public List<Player> getQuarterbackList() throws IOException;

	public List<Player> geRunningbackList() throws IOException;

	public List<Player> getWideRecieverList() throws IOException;

	public List<Player> getTightEndList() throws IOException;

	public List<Player> getKickerList() throws IOException;

	public List<Player> getDefenseList() throws IOException;

}
