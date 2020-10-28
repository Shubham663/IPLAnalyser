package com.bridgelabz.iplanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.bridgelabz.csvreader.CustomException;
import com.bridgelabz.iplanalyser.modelClasses.Batsman;
import com.bridgelabz.iplanalyser.modelClasses.Bowler;
import com.bridgelabz.iplanalyser.serviceClass.LoaderClass;

/**
 * Unit test for simple IPLAnalyser.
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
        assertEquals(101, LoaderClass.readRecords("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class));
    }
    
    @Test
    public void getDataTest_sortedByBattingAverage() {
    	Batsman []sortedByAvg = LoaderClass.readSortedByAvg("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("MS Dhoni", sortedByAvg[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikeRate() {
    	Batsman []sortedByStrikeRate = LoaderClass.readSortedByStrikeRate("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Ishant Sharma", sortedByStrikeRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedBy6sAnd4s() {
    	Batsman []sortedBy6sAnd4s = LoaderClass.readSortedBy6sAnd4s("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", sortedBy6sAnd4s[0].getName());
    }
    
    @Test
    public void getDataTest_sortedBy6sAnd4sAndStrikeRate() {
    	Batsman []sortedBy6sAnd4sAndStrikeRate = LoaderClass.readSortedBy6sAnd4sAndStrikeRate("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", sortedBy6sAnd4sAndStrikeRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikeRateAndAverage() {
    	Batsman []sortedByStrikeRateAndAverage = LoaderClass.readSortedByStrikeRateAndAverage("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Ishant Sharma", sortedByStrikeRateAndAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByMaxRunsAndAverage() {
    	Batsman []sortedByMaxRunsAndAverage = LoaderClass.readSortedByMaxRunsAndAverage("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("David Warner", sortedByMaxRunsAndAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByBowlerAverage() {
    	Bowler []sortedByBowlerAverage = LoaderClass.readSortedByBowlerAverage("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Anukul Roy", sortedByBowlerAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateBowler() {
    	Bowler []sortedByBowlerStrikingRate = LoaderClass.readSortedByBowlerStrikingRate("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByBowlerStrikingRate[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByEconomyBowler() {
    	Bowler []sortedByBowlerEconomy = LoaderClass.readSortedByBowlerEconomy("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Shivam Dube", sortedByBowlerEconomy[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateAnd5WAnd4Ws() {
    	Bowler []sortedByStrikeRate5wAnd4W = LoaderClass.readSortedByStrikeRate5WAnd4W("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByStrikeRate5wAnd4W[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByStrikingRateAndAverage() {
    	Bowler []sortedByStrikeRateAndAverage = LoaderClass.readSortedByStrikeRateAndAverageBowler("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Alzarri Joseph", sortedByStrikeRateAndAverage[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByAverageAndMostWickets() {
    	Bowler []sortedByAverageAndMostWickets = LoaderClass.readSortedByAverageAndMostWickets("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class);
    	assertEquals("Imran Tahir", sortedByAverageAndMostWickets[0].getName());
    }
    
    @Test
    public void getDataTest_sortedByAverageBowlingAndBatting() {
    	Batsman bestAverageBowlingAndBatting = LoaderClass.readSortedByAverageBowlingAndBatting("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class,"src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", bestAverageBowlingAndBatting.getName());
    }
    
    @Test
    public void getDataTest_BestAllRounder() {
    	Batsman bestAllRounder = LoaderClass.readBestAllRounder("src/main/java/com/bridgelabz/files/MostWickets.csv",Bowler.class,"src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Andre Russell", bestAllRounder.getName());
    }

    @Test
    public void getDataTest_BestAverageAndMaxHundreds() {
    	Batsman bestAverageAndMaxHundreds[] = LoaderClass.readBestAverageAndMaxHundreds("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("David Warner", bestAverageAndMaxHundreds[0].getName());
    }
    
    @Test
    public void getDataTest_BestAverageAndNoHundredsAndNoFifties() {
    	Batsman bestAverageAndNoHundredsAndNoFifties[] = LoaderClass.readBestAverageAndNoHundredsAndNoFifties("src/main/java/com/bridgelabz/files/MostRuns.csv",Batsman.class);
    	assertEquals("Marcus Stoinis", bestAverageAndNoHundredsAndNoFifties[0].getName());
    }
}
