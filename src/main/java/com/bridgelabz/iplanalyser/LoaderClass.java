package com.bridgelabz.iplanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bridgelabz.csvreader.CSVBuilderFactory;
import com.bridgelabz.csvreader.CustomException;
import com.bridgelabz.csvreader.ICSVBuilder;
import com.google.gson.Gson;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author Shubham
 * The class for loading data
 */
public class LoaderClass {

	public static<T> int readRecords(String fileName,Class clas){
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfBatsman = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfBatsman = csvToBean.parse();
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}
		
		return listOfBatsman.size();
	}

	public static<T> T[] readSortedByAvg(String fileName,Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Batsman> listOfBatsman = (List<Batsman>)listOfObjects;
			Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getAverage));
			Collections.reverse(listOfBatsman);
			Gson gson = new Gson();
			String json = gson.toJson(listOfBatsman);
			if(clas.equals(Batsman.class))
				batsmen = (T[])gson.fromJson(json, Batsman[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedByStrikeRate(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Batsman> listOfBatsman = (List<Batsman>)listOfObjects;
			Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getStrikeRate));
			Collections.reverse(listOfBatsman);
			Gson gson = new Gson();
			String json = gson.toJson(listOfBatsman);
			if(clas.equals(Batsman.class))
				batsmen = (T[])gson.fromJson(json, Batsman[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}
	
}
