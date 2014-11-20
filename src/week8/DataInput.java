package week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class DataInput {
	
	public static void main(String[] args) {
	
		DataInput dataInput = new DataInput();
//		dataInput.readFromLocalFile();
		dataInput.readFromDatabase();
		
	}
	
	public void readFromLocalFile() {
		// set the location of the file on your local disk to read from
//        String filePathString = "";       
        String filePathString = "resources" + File.separator + "week8" + File.separator + "MovieLens-100k-Ratings.data";

        // We need to handle exceptions here, so we initialise a Try.. Catch statement
        try {
        	
        	// We set the buffered reader to read in from the data file line-by-line
            BufferedReader br = new BufferedReader(new FileReader(filePathString));
            // Initialise a null String object for each line's text
            String line;                       
             
            // Initialise a while... loop that goes through each line in the file until no more lines can be read
            while ((line = br.readLine()) != null) {
            	            	
            	// tokenise the line: this means that split the line up into tokens
            	// we use the split() method which takes as a parameter the delimiter that separates values: tab
                String[] toks = line.split("\t");
                                
            }
                        
        // We catch anything that goes wrong here, and then print to the console the trace of the exception
        } catch (Exception  e) {
            e.printStackTrace();
        }
        
	}

	public void readFromDatabase() {
		String dbURL = "jdbc:mysql://148.88.19.39/";
		String dbName = "energy";
		String dbUser = "scc461user";
		String dbPass = "password";
		        
		try {
			// This points the JVM to the MySQL JDBC driver
			Class.forName ("com.mysql.jdbc.Driver").newInstance();
			
			// Initialise the connection to the database
			Connection connection = DriverManager.getConnection(dbURL + dbName + "?useCursorFetch=true",dbUser, dbPass);
			
			// query the db
			String query = "select * from temperature limit 10;";
		    Statement statement = connection.createStatement();
		    ResultSet results = statement.executeQuery(query);
		    while(results.next())  {
		        double temp = results.getDouble("temp");
		        Date date = results.getDate("recorddate");		        
		        System.out.println(date + " had temperature " + temp);		    			    	
		    }
		    statement.close();
		    connection.close();		    			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
