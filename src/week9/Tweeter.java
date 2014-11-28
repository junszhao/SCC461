package week9;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;

import au.com.bytecode.opencsv.CSVReader;

public class Tweeter {
	
	String screenName ;
	
	HashSet <Tweet> tweets = new HashSet<Tweet>();
	
	public Tweeter() {
		super();
	}
	
	public Tweeter(String screenName) {
		this.screenName = screenName;
	}
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public HashSet<Tweet> getTweets(){
		return this.tweets;
	}
	
	public void addTweets(Tweet tweet){
		tweets.add(tweet);
		return;
	}
	
	public static void main(String[] args) {
		// set the location to read the file from
		String fileName = "resources" + File.separator + "week9" + File.separator + "rda-plenary3-your-own.csv";      
				
		CSVReader reader = null;
			
		// Initialise a Try.. Catch statement to handle exceptions
		try {
			
			String [] nextLine;
			
			TreeMap<String, Tweeter> tweeters = new TreeMap<String, Tweeter>();
			
			// read in CSV files using external library opencsv
			
			reader = new CSVReader(new FileReader(fileName),',', '"');
			
			
			while ((nextLine = reader.readNext()) != null) {
				String screenName = nextLine[6];
				String tweetID = nextLine[0];
				
				Tweet t = new Tweet(tweetID);
                
                /*
                 * Exercise 2
                 */
				
				/// continue the counting
				
								
			}	
			
			
		}catch (Exception  e) {
			e.printStackTrace();
		} finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		
	}

}
