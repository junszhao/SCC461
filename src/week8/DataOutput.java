package week8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class DataOutput {

	public static void main(String[] args) {
		DataOutput dataOutput = new DataOutput();
		dataOutput.writeToFile();
		
String dbURL = "jdbc:mysql://148.88.19.39/";
String dbName = "energy";
String dbUser = "scc461user";
String dbPass = "password";
       
try {
     // This points the JVM to the MySQL JDBC driver
     Class.forName ("com.mysql.jdbc.Driver").newInstance();
    
     // Initialise the connection to the database
     Connection connection = DriverManager.getConnection(dbURL + dbName
               + "?useCursorFetch=true",dbUser, dbPass);
    
     StringBuffer buffer = new StringBuffer();
     ArrayList<String> dateStrings = new ArrayList<String>();
     dateStrings.add("2013-02-12");
     dateStrings.add("2013-02-13");
     dateStrings.add("2013-02-14");
     dateStrings.add("2013-02-15");
     dateStrings.add("2013-02-16");
    
     for (String dateString : dateStrings) {
         
          int dayWatts = 0;
          int dailyTally = 0;
    
          // query the db
          String query = "SELECT watts FROM wattage "
                    + "WHERE DATE_FORMAT(recorddate, '%Y-%m-%d') = '" + dateString  + "' "
                    + "and sensorid=0;";
         Statement statement = connection.createStatement();
         ResultSet results = statement.executeQuery(query);
         while(results.next())  {
             int watts = results.getInt("watts");
             dayWatts += watts;
             dailyTally++;
         }
         statement.close();
        
         // work out the average wattage
         int averageWatts = dayWatts / dailyTally;
        
         // append the total day wattage to the buffer
         buffer.append(averageWatts + "\n");
                
       }
             connection.close();         
            
             System.out.println(buffer.toString());
        } catch(Exception e) {
             e.printStackTrace();
        }                   
}

	
	
	public void writeToFile() {
		// Set the location of the file to write to
		String filePath = "test.csv";
		// Set the content to be written
		String contentToWrite = "Hello World";
		
		// Intiialise a try... catch statement in case there is an exception
		try {
			// Create an object that handles the writing, this writes via an outputstream to a file 
            PrintWriter writer = new PrintWriter(new FileOutputStream(new File(filePath),
            		false));
            // Write the content
            writer.println(contentToWrite);
            // Close the writing output stream
            writer.close();        	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
}
