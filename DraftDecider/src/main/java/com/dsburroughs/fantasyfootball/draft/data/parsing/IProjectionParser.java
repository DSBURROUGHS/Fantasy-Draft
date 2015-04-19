package com.dsburroughs.fantasyfootball.draft.data.parsing;

import com.dsburroughs.fantasyfootball.players.Player;

import java.util.List;

public interface IProjectionParser {

    List<Player> getQuarterbackList() throws Exception;

    List<Player> getRunningbackList() throws Exception;

    List<Player> getWideRecieverList() throws Exception;

    List<Player> getTightEndList() throws Exception;

    List<Player> getKickerList() throws Exception;

    List<Player> getDefenseList() throws Exception;

    List<Player> getRoster() throws Exception;
}
