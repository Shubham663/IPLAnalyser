package com.bridgelabz.iplanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	public static<T> T[] readSortedBy6sAnd4s(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Batsman> listOfBatsman = (List<Batsman>)listOfObjects;
			Collections.sort(listOfBatsman,Comparator.comparingInt(Batsman::getFoursAndSixes));
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

	public static<T> T[] readSortedBy6sAnd4sAndStrikeRate(String fileName, Class clas) {
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
			Collections.sort(listOfBatsman,Comparator.comparingInt(Batsman::getFoursAndSixes));
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

	public static<T> T[] readSortedByStrikeRateAndAverage(String fileName, Class clas) {
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

	public static<T> T[] readSortedByMaxRunsAndAverage(String fileName, Class clas) {
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
			Collections.sort(listOfBatsman,Comparator.comparingInt(Batsman::getRuns));
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

	public static<T> T[] readSortedByBowlerAverage(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getAverage));
			Gson gson = new Gson();
			String json = gson.toJson(listOfBowler);
			if(clas.equals(Bowler.class))
				bowler = (T[])gson.fromJson(json, Bowler[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByBowlerStrikingRate(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getSr));
			Gson gson = new Gson();
			String json = gson.toJson(listOfBowler);
			if(clas.equals(Bowler.class))
				bowler = (T[])gson.fromJson(json, Bowler[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByBowlerEconomy(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getEconomy));
			Gson gson = new Gson();
			String json = gson.toJson(listOfBowler);
			if(clas.equals(Bowler.class))
				bowler = (T[])gson.fromJson(json, Bowler[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByStrikeRate5WAnd4W(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getSr));
			listOfBowler = listOfBowler.stream().filter(t -> {return t.getFiveWickets() > 0 || t.getFourWickets() > 0;}).collect(Collectors.toList());
			Gson gson = new Gson();
			String json = gson.toJson(listOfBowler);
			if(clas.equals(Bowler.class))
				bowler = (T[])gson.fromJson(json, Bowler[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByStrikeRateAndAverageBowler(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
			listOfObjects = csvToBean.parse();
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getAverage));
			Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getSr));
			Gson gson = new Gson();
			String json = gson.toJson(listOfBowler);
			if(clas.equals(Bowler.class))
				bowler = (T[])gson.fromJson(json, Bowler[].class);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}
	
}
