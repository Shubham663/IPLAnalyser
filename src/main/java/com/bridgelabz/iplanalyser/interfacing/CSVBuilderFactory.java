package com.bridgelabz.iplanalyser.interfacing;

/**
 * Generates builder for the csv file
 * @author Shubham
 *
 */
public class CSVBuilderFactory {
	public static ICSVBuilder getBuilder(){
		return new OpenCSVBuilder();
	}
}
