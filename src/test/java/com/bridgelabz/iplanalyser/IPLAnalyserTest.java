package com.bridgelabz.iplanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.bridgelabz.csvreader.CustomException;

/**
 * Unit test for simple App.
 */
public class IPLAnalyserTest 
{
    /**
     * Rigorous Test :-)
     * @throws CustomException 
     * @throws IOException 
     */
    @Test
    public void loadDataTest_returnsNoOfRecords() {
        assertEquals(101, LoaderClass.readRecords("MostRuns.csv",Batsman.class));
    }
    
    @Test
    public void getDataTest_sortedByBattingAverage() {
    	Batsman []sortedByAvg = LoaderClass.readSortedByAvg("MostRuns.csv",Batsman.class);
    	assertEquals("MS Dhoni", sortedByAvg[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikeRate() {
    	Batsman []sortedByStrikeRate = LoaderClass.readSortedByStrikeRate("MostRuns.csv",Batsman.class);
    	assertEquals("Ishant Sharma", sortedByStrikeRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedBy6sAnd4s() {
    	Batsman []sortedBy6sAnd4s = LoaderClass.readSortedBy6sAnd4s("MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", sortedBy6sAnd4s[0].getName());
    }
    
    @Test
    public void getDataTest_sortedBy6sAnd4sAndStrikeRate() {
    	Batsman []sortedBy6sAnd4sAndStrikeRate = LoaderClass.readSortedBy6sAnd4sAndStrikeRate("MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", sortedBy6sAnd4sAndStrikeRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikeRateAndAverage() {
    	Batsman []sortedByStrikeRateAndAverage = LoaderClass.readSortedByStrikeRateAndAverage("MostRuns.csv",Batsman.class);
    	assertEquals("Ishant Sharma", sortedByStrikeRateAndAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByMaxRunsAndAverage() {
    	Batsman []sortedByMaxRunsAndAverage = LoaderClass.readSortedByMaxRunsAndAverage("MostRuns.csv",Batsman.class);
    	assertEquals("David Warner", sortedByMaxRunsAndAverage[0].getName());
    }
}
