package com.dsburroughs.fantasyfootball.draft.league.configuration;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LeagueConfigurationLoader {

    public LeagueConfiguration loadConfiguration(String fileName) throws IOException {

        LeagueConfiguration league = new LeagueConfiguration();

        Properties prop = new Properties();
        FileReader reader = new FileReader(fileName + ".properties");
        prop.load(reader);

        league.setName(prop.getProperty("league.name"));
        league.setTeams(Integer.parseInt(prop.getProperty("league.teams")));
        league.setDraftStyle(DraftStyle.valueOf(prop.getProperty("league.draft.style")));
        league.setSkillLevel(Integer.parseInt(prop.getProperty("league.skill")));
        league.setFractionalPoints(Boolean.parseBoolean(prop.getProperty("league.points.fractional")));

        league.setPointsPerPassingYard(Double.parseDouble(prop.getProperty("league.points.passing.yards")));
        league.setPointsPerPassingTouchdown(Double.parseDouble(prop.getProperty("league.points.passing.touchdown")));
        league.setPointsPerInterception(Double.parseDouble(prop.getProperty("league.points.passing.interception")));

        league.setPointsPerRushingYard(Double.parseDouble(prop.getProperty("league.points.rushing.yards")));
        league.setPointsPerRushingTouchdown(Double.parseDouble(prop.getProperty("league.points.rushing.touchdown")));
        league.setPointsPerFumble(Double.parseDouble(prop.getProperty("league.points.rushing.fumbles")));

        league.setPointsPerRecievingYard(Double.parseDouble(prop.getProperty("league.points.recieving.yards")));
        league.setPointsPerRecievingTouchdown(Double.parseDouble(prop.getProperty("league.points.recieving.touchdown")));

        league.setPointsPerReception(Double.parseDouble(prop.getProperty("league.points.rushing.receptions")));
        league.setPointsPerConversion(Double.parseDouble(prop.getProperty("league.points.rushing.conversion")));
        league.setPointsPerReturnYard(Double.parseDouble(prop.getProperty("league.points.rushing.return.yards")));

        league.setRosterSize(Integer.parseInt(prop.getProperty("league.roster.size")));

        league.setQbStart(Integer.parseInt(prop.getProperty("league.roster.qb.start")));
        league.setQbMax(Integer.parseInt(prop.getProperty("league.roster.qb.max")));
        league.setQbValue(Integer.parseInt(prop.getProperty("league.roster.qb.valued")));

        league.setRbStart(Integer.parseInt(prop.getProperty("league.roster.rb.start")));
        league.setRbMax(Integer.parseInt(prop.getProperty("league.roster.rb.max")));
        league.setRbValue(Integer.parseInt(prop.getProperty("league.roster.rb.valued")));

        league.setWrStart(Integer.parseInt(prop.getProperty("league.roster.wr.start")));
        league.setWrMax(Integer.parseInt(prop.getProperty("league.roster.wr.max")));
        league.setWrValue(Integer.parseInt(prop.getProperty("league.roster.wr.valued")));

        league.setTeStart(Integer.parseInt(prop.getProperty("league.roster.te.start")));
        league.setTeMax(Integer.parseInt(prop.getProperty("league.roster.te.max")));
        league.setTeValue(Integer.parseInt(prop.getProperty("league.roster.te.valued")));

        league.setDefStart(Integer.parseInt(prop.getProperty("league.roster.def.start")));
        league.setDefMax(Integer.parseInt(prop.getProperty("league.roster.def.max")));
        league.setDefValue(Integer.parseInt(prop.getProperty("league.roster.def.valued")));

        league.setkStart(Integer.parseInt(prop.getProperty("league.roster.k.start")));
        league.setkMax(Integer.parseInt(prop.getProperty("league.roster.k.max")));
        league.setkValue(Integer.parseInt(prop.getProperty("league.roster.k.valued")));

        league.setFlexStart(Integer.parseInt(prop.getProperty("league.roster.flex.start")));

        league.setQbFlex(Boolean.parseBoolean(prop.getProperty("league.roster.flex.qb")));
        league.setRbFlex(Boolean.parseBoolean(prop.getProperty("league.roster.flex.rb")));
        league.setWrFlex(Boolean.parseBoolean(prop.getProperty("league.roster.flex.wr")));
        league.setTeFlex(Boolean.parseBoolean(prop.getProperty("league.roster.flex.te")));

        return league;
    }

}
