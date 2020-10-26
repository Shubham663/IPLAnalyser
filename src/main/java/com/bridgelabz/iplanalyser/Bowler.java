package com.bridgelabz.iplanalyser;

import com.opencsv.bean.CsvBindByName;

/**
 * @author Shubham
 *
 */
public class Bowler {
	@CsvBindByName(column = "PLAYER")
	private String name;
	@CsvBindByName(column = "Mat")
	private int matches;
	@CsvBindByName(column = "Inns")
	private int innings;
	@CsvBindByName(column = "Ov")
	private double overs;
	@CsvBindByName(column = "Runs")
	private int runs;
	@CsvBindByName(column = "Wkts")
	private int wickets;
	@CsvBindByName(column = "BBI")
	private double bbi;
	@CsvBindByName(column = "Avg")
	private double average;
	@CsvBindByName(column = "Econ")
	private double economy;
	@CsvBindByName(column = "SR")
	private double sr;
	@CsvBindByName(column = "4w")
	private int fourWickets;
	@CsvBindByName(column = "5w")
	private int fiveWickets;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the matches
	 */
	public int getMatches() {
		return matches;
	}
	/**
	 * @param matches the matches to set
	 */
	public void setMatches(int matches) {
		this.matches = matches;
	}
	/**
	 * @return the innings
	 */
	public int getInnings() {
		return innings;
	}
	/**
	 * @param innings the innings to set
	 */
	public void setInnings(int innings) {
		this.innings = innings;
	}
	/**
	 * @return the overs
	 */
	public double getOvers() {
		return overs;
	}
	/**
	 * @param overs the overs to set
	 */
	public void setOvers(double overs) {
		this.overs = overs;
	}
	/**
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}
	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}
	/**
	 * @return the wickets
	 */
	public int getWickets() {
		return wickets;
	}
	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	/**
	 * @return the bbi
	 */
	public double getBbi() {
		return bbi;
	}
	/**
	 * @param bbi the bbi to set
	 */
	public void setBbi(double bbi) {
		this.bbi = bbi;
	}
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	/**
	 * @return the economy
	 */
	public double getEconomy() {
		return economy;
	}
	/**
	 * @param economy the economy to set
	 */
	public void setEconomy(double economy) {
		this.economy = economy;
	}
	/**
	 * @return the sr
	 */
	public double getSr() {
		return sr;
	}
	/**
	 * @param sr the sr to set
	 */
	public void setSr(double sr) {
		this.sr = sr;
	}
	/**
	 * @return the fourWickets
	 */
	public int getFourWickets() {
		return fourWickets;
	}
	/**
	 * @param fourWickets the fourWickets to set
	 */
	public void setFourWickets(int fourWickets) {
		this.fourWickets = fourWickets;
	}
	/**
	 * @return the fiveWickets
	 */
	public int getFiveWickets() {
		return fiveWickets;
	}
	/**
	 * @param fiveWickets the fiveWickets to set
	 */
	public void setFiveWickets(int fiveWickets) {
		this.fiveWickets = fiveWickets;
	}
	@Override
	public String toString() {
		return "Bowler [name=" + name + ", matches=" + matches + ", innings=" + innings + ", overs=" + overs + ", runs="
				+ runs + ", wickets=" + wickets + ", bbi=" + bbi + ", average=" + average + ", economy=" + economy
				+ ", sr=" + sr + ", fourWickets=" + fourWickets + ", fiveWickets=" + fiveWickets + "]";
	}
}
