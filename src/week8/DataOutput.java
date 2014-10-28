package week8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DataOutput {

	public static void main(String[] args) {
		DataOutput dataOutput = new DataOutput();
		dataOutput.writeToFile();
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
