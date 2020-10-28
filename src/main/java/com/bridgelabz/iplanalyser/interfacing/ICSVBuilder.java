package com.bridgelabz.iplanalyser.interfacing;

import java.io.IOException;
import java.util.List;

/**
 * Interface implemented by class returning the builder object
 * @author Shubham
 *
 */
public interface ICSVBuilder {
	public<T> List getList(String fileName, Class clas) throws IOException;
}
