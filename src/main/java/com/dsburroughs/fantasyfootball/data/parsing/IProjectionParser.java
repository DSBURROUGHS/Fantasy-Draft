package com.dsburroughs.fantasyfootball.data.parsing;

import java.io.IOException;
import java.util.List;

import com.dsburroughs.fantasyfootball.players.Player;

public interface IProjectionParser {

	public List<Player> getQuarterbackList() throws IOException, FormatChangeException;

	public List<Player> geRunningbackList() throws IOException, FormatChangeException;

	public List<Player> getWideRecieverList() throws IOException, FormatChangeException;

	public List<Player> getTightEndList() throws IOException, FormatChangeException;

	public List<Player> getKickerList() throws IOException, FormatChangeException;

	public List<Player> getDefenseList() throws IOException, FormatChangeException;
}
