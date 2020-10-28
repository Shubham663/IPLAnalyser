package com.bridgelabz.iplanalyser.serviceClass;

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

import com.bridgelabz.iplanalyser.interfacing.CSVBuilderFactory;
import com.bridgelabz.iplanalyser.interfacing.ICSVBuilder;
import com.bridgelabz.iplanalyser.modelClasses.Batsman;
import com.bridgelabz.iplanalyser.modelClasses.Bowler;
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
		List<T> listOfObjects = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}
		
		return listOfObjects.size();
	}

	public static<T> T[] readSortedByAvg(String fileName,Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedByStrikeRate(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Strike Rate");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedBy6sAnd4s(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Sixes And Fours");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedBy6sAnd4sAndStrikeRate(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Strike Rate");
			listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Sixes And Fours");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedByStrikeRateAndAverage(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Strike Rate");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedByMaxRunsAndAverage(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Runs");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readSortedByBowlerAverage(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Average");
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByBowlerStrikingRate(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Strike Rate");
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByBowlerEconomy(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Economy");
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByStrikeRate5WAnd4W(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Strike Rate");
			listOfBowler = listOfBowler.stream().filter(t -> {return t.getFiveWickets() > 0 || t.getFourWickets() > 0;}).collect(Collectors.toList());
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByStrikeRateAndAverageBowler(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Average");
			listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Strike Rate");
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T> T[] readSortedByAverageAndMostWickets(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] bowler = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Average");
			Collections.reverse(listOfBowler);
			listOfBowler = (List<Bowler>)sort(listOfObjects,Bowler.class,"Wickets");
			Collections.reverse(listOfBowler);
			bowler = (T[])getGenericArray(listOfBowler,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return bowler;
		}
	}

	public static<T,Y> T readSortedByAverageBowlingAndBatting(String fileName, Class clas, String fileName2, Class clas2) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		List<Y> listOfObjects2 = null;
		T[] batsman = null;
		try {
			listOfObjects2 = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects2,Bowler.class,"Average");
			Collections.reverse(listOfBowler);
			listOfObjects = getListOfObjects(fileName2,clas2);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			Collections.reverse(listOfBatsman);
			listOfBatsman = listOfBatsman.stream().filter(s -> {
				for(int i=0;i<listOfBowler.size();i++) {
					String name = listOfBowler.get(i).getName();
					if(name.equals(s.getName()))
						return true;
				}
				return false;
			}).collect(Collectors.toList());
			batsman = (T[])getGenericArray(listOfBatsman,clas2);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}catch(Exception e){
			System.out.println("Error : " + e.getCause());
		}finally {
			return batsman[0];
		}
	}

	public static<T,Y> T readBestAllRounder(String fileName, Class clas, String fileName2,
			Class clas2) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		List<Y> listOfObjects2 = null;
		T[] batsman = null;
		try {
			listOfObjects2 = getListOfObjects(fileName,clas);
			List<Bowler> listOfBowler = (List<Bowler>)sort(listOfObjects2,Bowler.class,"Wickets");
			Collections.reverse(listOfBowler);
			listOfObjects = getListOfObjects(fileName2,clas2);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Runs");
			Collections.reverse(listOfBatsman);
			listOfBatsman = listOfBatsman.stream().filter(s -> {
				for(int i=0;i<listOfBowler.size();i++) {
					String name = listOfBowler.get(i).getName();
					if(name.equals(s.getName()))
						return true;
				}
				return false;
			}).collect(Collectors.toList());
			batsman = (T[])getGenericArray(listOfBatsman,clas2);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsman[0];
		}
	}

	public static<T> T[] readBestAverageAndMaxHundreds(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		Reader reader = null;
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			listOfBatsman = (List<Batsman>)sort(listOfBatsman,Batsman.class,"Max Hundreds");
			Collections.reverse(listOfBatsman);
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	public static<T> T[] readBestAverageAndNoHundredsAndNoFifties(String fileName, Class clas) {
		Logger logger = LogManager.getLogger(LoaderClass.class);
		List<T> listOfObjects = null;
		T[] batsmen = null;
		try {
			listOfObjects = getListOfObjects(fileName,clas);
			List<Batsman> listOfBatsman = (List<Batsman>)sort(listOfObjects,Batsman.class,"Average");
			Collections.reverse(listOfBatsman);
			listOfBatsman = listOfBatsman.stream().filter(batsman -> batsman.getHundreds() == 0 && batsman.getFifties() == 0).collect(Collectors.toList());
			batsmen = (T[])getGenericArray(listOfBatsman,clas);
		} catch (IOException e) {
			System.out.println("Error while reading file " + e.getMessage());
		}finally {
			return batsmen;
		}
	}

	private static<T> List<T> sort(List<T> listOfObjects, Class clas, String field) {
		if(clas.equals(Batsman.class)) {
			List<Batsman> listOfBatsman = (List<Batsman>)listOfObjects;
			if(field.equals("Average")) {
				Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getAverage));
			}
			else if(field.equals("Max Hundreds")) {
				Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getHundreds));
			}
			else if(field.equals("Runs")) {
				Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getRuns));
			}
			else if(field.equals("Strike Rate")) {
				Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getStrikeRate));
			}
			else if(field.equals("Sixes And Fours")) {
				Collections.sort(listOfBatsman,Comparator.comparingDouble(Batsman::getFoursAndSixes));
			}
			return (List<T>)listOfBatsman;
		}
		else if(clas.equals(Bowler.class)) {
			List<Bowler> listOfBowler = (List<Bowler>)listOfObjects;
			if(field.equals("Wickets")) {
				Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getWickets));
			}
			else if(field.equals("Average")) {
				Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getAverage));
			}
			else if(field.equals("Strike Rate")) {
				Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getSr));
			}
			else if(field.equals("Economy")) {
				Collections.sort(listOfBowler,Comparator.comparingDouble(Bowler::getEconomy));
			}
			return (List<T>)listOfBowler;
		}
		return null;
	}

	private static<T> T[] getGenericArray(List<T> listOfBatsman, Class clas) {
		T[] cricketers = null;
		Gson gson = new Gson();
		String json = gson.toJson(listOfBatsman);
		if(clas.equals(Batsman.class))
			cricketers = (T[])gson.fromJson(json, Batsman[].class);
		else if(clas.equals(Bowler.class))
			cricketers = (T[])gson.fromJson(json, Bowler[].class);
		return cricketers;
	}

	private static<T> List<T> getListOfObjects(String fileName, Class clas) throws IOException {
		ICSVBuilder icsvFileBuilder = CSVBuilderFactory.getBuilder();
		List<T> listOfObjects = icsvFileBuilder.getList(fileName, clas);
		return listOfObjects;
	}
	
}
