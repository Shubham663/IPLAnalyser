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
    
    @Test
    public void getDataTest_sortedByBowlerAverage() {
    	Bowler []sortedByBowlerAverage = LoaderClass.readSortedByBowlerAverage("MostWickets.csv",Bowler.class);
    	assertEquals("Anukul Roy", sortedByBowlerAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateBowler() {
    	Bowler []sortedByBowlerStrikingRate = LoaderClass.readSortedByBowlerStrikingRate("MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByBowlerStrikingRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByEconomyBowler() {
    	Bowler []sortedByBowlerEconomy = LoaderClass.readSortedByBowlerEconomy("MostWickets.csv",Bowler.class);
    	assertEquals("Shivam Dube", sortedByBowlerEconomy[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateAnd5WAnd4Ws() {
    	Bowler []sortedByStrikeRate5wAnd4W = LoaderClass.readSortedByStrikeRate5WAnd4W("MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByStrikeRate5wAnd4W[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateAndAverage() {
    	Bowler []sortedByStrikeRateAndAverage = LoaderClass.readSortedByStrikeRateAndAverageBowler("MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByStrikeRateAndAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByAverageAndMostWickets() {
    	Bowler []sortedByAverageAndMostWickets = LoaderClass.readSortedByAverageAndMostWickets("MostWickets.csv",Bowler.class);
    	assertEquals("Imran Tahir", sortedByAverageAndMostWickets[0].getName());
    }
}
