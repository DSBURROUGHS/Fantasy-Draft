package com.dsburroughs.fantasyfootball.data.parsing;

import java.util.List;

import com.dsburroughs.fantasyfootball.players.Player;

public interface IProjectionParser {

	public List<Player> getQuarterbackList() throws Exception;

	public List<Player> getRunningbackList() throws Exception;

	public List<Player> getWideRecieverList() throws Exception;

	public List<Player> getTightEndList() throws Exception;

	public List<Player> getKickerList() throws Exception;

	public List<Player> getDefenseList() throws Exception;
	
	public List<Player> getRoster() throws Exception;
}
