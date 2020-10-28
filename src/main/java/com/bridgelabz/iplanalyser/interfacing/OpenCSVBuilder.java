package com.bridgelabz.iplanalyser.interfacing;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author Shubham
 *
 */
public class OpenCSVBuilder implements ICSVBuilder {

	@Override
	public<T> List getList(String fileName, Class clas) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(fileName));
		CsvToBean csvToBean =  new CsvToBeanBuilder<>(reader).withType(clas).build();
		List<T> listOfObjects = csvToBean.parse();
		return listOfObjects;
	}

}
