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
}
