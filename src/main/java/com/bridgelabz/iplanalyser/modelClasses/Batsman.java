package com.bridgelabz.iplanalyser.modelClasses;

import com.opencsv.bean.CsvBindByName;

/**
 * The class storing batsman's statistics
 * @author Shubham
 */
public class Batsman {
	@CsvBindByName(column = "PLAYER")
	private String name;
	@CsvBindByName(column = "Mat")
	private int matches;
	@CsvBindByName(column = "Inns")
	private int innings;
	@CsvBindByName(column = "NO")
	private int notOut;
	@CsvBindByName(column = "Runs")
	private int runs;
	@CsvBindByName(column = "HS")
	private String highestScore;
	@CsvBindByName(column = "Avg")
	private double average;
	@CsvBindByName(column = "BF")
	private int bF;
	@CsvBindByName(column = "SR")
	private double strikeRate;
	@CsvBindByName(column = "100")
	private int hundreds;
	@CsvBindByName(column = "50")
	private int fifties;
	@CsvBindByName(column = "4s")
	private int fours;
	@CsvBindByName(column = "6s")
	private int sixes;
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
	 * @return the notOut
	 */
	public int getNotOut() {
		return notOut;
	}
	/**
	 * @param notOut the notOut to set
	 */
	public void setNotOut(int notOut) {
		this.notOut = notOut;
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
	 * @return the highestScore
	 */
	public String getHighestScore() {
		return highestScore;
	}
	/**
	 * @param highestScore the highestScore to set
	 */
	public void setHighestScore(String highestScore) {
		this.highestScore = highestScore;
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
	 * @return the bF
	 */
	public int getbF() {
		return bF;
	}
	/**
	 * @param bF the bF to set
	 */
	public void setbF(int bF) {
		this.bF = bF;
	}
	/**
	 * @return the strikeRate
	 */
	public double getStrikeRate() {
		return strikeRate;
	}
	/**
	 * @param strikeRate the strikeRate to set
	 */
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	/**
	 * @return the hundreds
	 */
	public int getHundreds() {
		return hundreds;
	}
	/**
	 * @param hundreds the hundreds to set
	 */
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	/**
	 * @return the fifties
	 */
	public int getFifties() {
		return fifties;
	}
	/**
	 * @param fifties the fifties to set
	 */
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	/**
	 * @return the fours
	 */
	public int getFours() {
		return fours;
	}
	/**
	 * @param fours the fours to set
	 */
	public void setFours(int fours) {
		this.fours = fours;
	}
	/**
	 * @return the sixes
	 */
	public int getSixes() {
		return sixes;
	}
	/**
	 * @param sixes the sixes to set
	 */
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	/**
	 * @return the sixes
	 */
	public int getFoursAndSixes() {
		return sixes+fours;
	}
	
	@Override
	public String toString() {
		return "Batsman [name=" + name + ", matches=" + matches + ", innings=" + innings + ", notOut=" + notOut
				+ ", runs=" + runs + ", highestScore=" + highestScore + ", average=" + average + ", bF=" + bF
				+ ", strikeRate=" + strikeRate + ", hundreds=" + hundreds + ", fifties=" + fifties + ", fours=" + fours
				+ ", sixes=" + sixes + "]";
	}
}
