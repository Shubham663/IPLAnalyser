package com.bridgelabz.iplanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bridgelabz.csvreader.CSVBuilderFactory;
import com.bridgelabz.csvreader.CustomException;
import com.bridgelabz.csvreader.ICSVBuilder;
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

	public static void readSortedByAvg() {
		// TODO Auto-generated method stub
		
	}
	
}
