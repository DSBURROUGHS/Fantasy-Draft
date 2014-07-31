package com.dsburroughs.fantasyfootball.data.configuration;

public class LeagueConfiguration {

	private String name;
	private int teams;
	private DraftStyle draftStyle;
	private int skillLevel;

	private int rosterSize;

	private int qbStart;
	private int qbMax;
	private int qbValue;

	private int rbStart;
	private int rbMax;
	private int rbValue;

	private int wrStart;
	private int wrMax;
	private int wrValue;

	private int teStart;
	private int teMax;
	private int teValue;

	private int defStart;
	private int defMax;
	private int defValue;

	private int kStart;
	private int kMax;
	private int kValue;

	private int flexStart;
	private boolean qbFlex;
	private boolean rbFlex;
	private boolean wrFlex;
	private boolean teFlex;

	private boolean fractionalPoints;

	private double pointsPerPassingYard;
	private double pointsPerPassingTouchdown;
	private double pointsPerInterception;

	private double pointsPerRushingYard;
	private double pointsPerRushingTouchdown;
	private double pointsPerFumble;

	private double pointsPerRecievingYard;
	private double pointsPerRecievingTouchdown;

	private double pointsPerReception;
	private double pointsPerConversion;
	private double pointsPerReturnYard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeams() {
		return teams;
	}

	public void setTeams(int teams) {
		this.teams = teams;
	}

	public DraftStyle getDraftStyle() {
		return draftStyle;
	}

	public void setDraftStyle(DraftStyle draftStyle) {
		this.draftStyle = draftStyle;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public int getRosterSize() {
		return rosterSize;
	}

	public void setRosterSize(int rosterSize) {
		this.rosterSize = rosterSize;
	}

	public int getQbStart() {
		return qbStart;
	}

	public void setQbStart(int qbStart) {
		this.qbStart = qbStart;
	}

	public int getQbMax() {
		return qbMax;
	}

	public void setQbMax(int qbMax) {
		this.qbMax = qbMax;
	}

	public int getQbValue() {
		return qbValue;
	}

	public void setQbValue(int qbValue) {
		this.qbValue = qbValue;
	}

	public int getRbStart() {
		return rbStart;
	}

	public void setRbStart(int rbStart) {
		this.rbStart = rbStart;
	}

	public int getRbMax() {
		return rbMax;
	}

	public void setRbMax(int rbMax) {
		this.rbMax = rbMax;
	}

	public int getRbValue() {
		return rbValue;
	}

	public void setRbValue(int rbValue) {
		this.rbValue = rbValue;
	}

	public int getWrStart() {
		return wrStart;
	}

	public void setWrStart(int wrStart) {
		this.wrStart = wrStart;
	}

	public int getWrMax() {
		return wrMax;
	}

	public void setWrMax(int wrMax) {
		this.wrMax = wrMax;
	}

	public int getWrValue() {
		return wrValue;
	}

	public void setWrValue(int wrValue) {
		this.wrValue = wrValue;
	}

	public int getTeStart() {
		return teStart;
	}

	public void setTeStart(int teStart) {
		this.teStart = teStart;
	}

	public int getTeMax() {
		return teMax;
	}

	public void setTeMax(int teMax) {
		this.teMax = teMax;
	}

	public int getTeValue() {
		return teValue;
	}

	public void setTeValue(int teValue) {
		this.teValue = teValue;
	}

	public int getDefStart() {
		return defStart;
	}

	public void setDefStart(int defStart) {
		this.defStart = defStart;
	}

	public int getDefMax() {
		return defMax;
	}

	public void setDefMax(int defMax) {
		this.defMax = defMax;
	}

	public int getDefValue() {
		return defValue;
	}

	public void setDefValue(int defValue) {
		this.defValue = defValue;
	}

	public int getkStart() {
		return kStart;
	}

	public void setkStart(int kStart) {
		this.kStart = kStart;
	}

	public int getkMax() {
		return kMax;
	}

	public void setkMax(int kMax) {
		this.kMax = kMax;
	}

	public int getkValue() {
		return kValue;
	}

	public void setkValue(int kValue) {
		this.kValue = kValue;
	}

	public int getFlexStart() {
		return flexStart;
	}

	public void setFlexStart(int flexStart) {
		this.flexStart = flexStart;
	}

	public boolean isQbFlex() {
		return qbFlex;
	}

	public void setQbFlex(boolean qbFlex) {
		this.qbFlex = qbFlex;
	}

	public boolean isRbFlex() {
		return rbFlex;
	}

	public void setRbFlex(boolean rbFlex) {
		this.rbFlex = rbFlex;
	}

	public boolean isWrFlex() {
		return wrFlex;
	}

	public void setWrFlex(boolean wrFlex) {
		this.wrFlex = wrFlex;
	}

	public boolean isTeFlex() {
		return teFlex;
	}

	public void setTeFlex(boolean teFlex) {
		this.teFlex = teFlex;
	}

	public boolean isFractionalPoints() {
		return fractionalPoints;
	}

	public void setFractionalPoints(boolean fractionalPoints) {
		this.fractionalPoints = fractionalPoints;
	}

	public double getPointsPerPassingYard() {
		return pointsPerPassingYard;
	}

	public void setPointsPerPassingYard(double pointsPerPassingYard) {
		this.pointsPerPassingYard = pointsPerPassingYard;
	}

	public double getPointsPerPassingTouchdown() {
		return pointsPerPassingTouchdown;
	}

	public void setPointsPerPassingTouchdown(double pointsPerPassingTouchdown) {
		this.pointsPerPassingTouchdown = pointsPerPassingTouchdown;
	}

	public double getPointsPerInterception() {
		return pointsPerInterception;
	}

	public void setPointsPerInterception(double pointsPerInterception) {
		this.pointsPerInterception = pointsPerInterception;
	}

	public double getPointsPerRushingYard() {
		return pointsPerRushingYard;
	}

	public void setPointsPerRushingYard(double pointsPerRushingYard) {
		this.pointsPerRushingYard = pointsPerRushingYard;
	}

	public double getPointsPerRushingTouchdown() {
		return pointsPerRushingTouchdown;
	}

	public void setPointsPerRushingTouchdown(double pointsPerRushingTouchdown) {
		this.pointsPerRushingTouchdown = pointsPerRushingTouchdown;
	}

	public double getPointsPerFumble() {
		return pointsPerFumble;
	}

	public void setPointsPerFumble(double pointsPerFumble) {
		this.pointsPerFumble = pointsPerFumble;
	}

	public double getPointsPerReception() {
		return pointsPerReception;
	}

	public void setPointsPerReception(double pointsPerReception) {
		this.pointsPerReception = pointsPerReception;
	}

	public double getPointsPerConversion() {
		return pointsPerConversion;
	}

	public void setPointsPerConversion(double pointsPerConversion) {
		this.pointsPerConversion = pointsPerConversion;
	}

	public double getPointsPerReturnYard() {
		return pointsPerReturnYard;
	}

	public void setPointsPerReturnYard(double pointsPerReturnYard) {
		this.pointsPerReturnYard = pointsPerReturnYard;
	}

	public double getPointsPerRecievingYard() {
		return pointsPerRecievingYard;
	}

	public void setPointsPerRecievingYard(double pointsPerRecievingYard) {
		this.pointsPerRecievingYard = pointsPerRecievingYard;
	}

	public double getPointsPerRecievingTouchdown() {
		return pointsPerRecievingTouchdown;
	}

	public void setPointsPerRecievingTouchdown(double pointsPerRecievingTouchdown) {
		this.pointsPerRecievingTouchdown = pointsPerRecievingTouchdown;
	}

}
