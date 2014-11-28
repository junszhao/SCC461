package week9;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.com.bytecode.opencsv.CSVReader;


public class Tweet {
	
	String tweetContent;
	
	String tweetID;
	
	HashSet<String> hashtags = new HashSet<String>();
	
	
	public Tweet() {
		super();
	}
	
	public Tweet(String tweetID) {
		super();
		this.tweetID = tweetID;
	}
	

	
	public static void main(String[] args) {
	
		// set the location to read the file from
		String fileName = "resources" + File.separator + "week9" + File.separator + "rda-plenary3.csv";
		
		
		CSVReader reader = null;
	
		// Initialise a Try.. Catch statement to handle exceptions
		try {
		        	
			// Create hashmap for sorting unique values
			
			HashMap<String, Integer> hashtags = new HashMap<String, Integer>();		
			
			// read in CSV files using external library opencsv
						
			reader = new CSVReader(new FileReader(fileName),',', '"');
			
			reader.readNext();
			
			String [] nextLine;
			
						
			/*
			 * Beginning of Task 1
			 */
												
			while ((nextLine = reader.readNext()) != null) {
				String hashtag = nextLine[10];
				Integer frequency = 0;
							
				if (hashtags.containsKey(hashtag)){
					frequency = hashtags.get(hashtag);
					hashtags.put(hashtag, frequency + 1);	
				}else {
					hashtags.put(hashtag, new Integer(1));
				}
			}
            
            // Complete the code to find out what is in your hashtag
			
			/*
			 * End of Task 1
			 */
			
			
	
		// Catch an exception if something goes wrong
		} catch (Exception  e) {
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
