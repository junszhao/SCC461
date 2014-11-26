package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	public static void main(String[] args) {
		RegEx regEx = new RegEx();
		regEx.runMatch();
		regEx.replaceText();		
	}
	
	public void runMatch() {
		
		String patternString = "";			
		String input = "";
		
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(input);
		        
		while (m.find()) {
        	String output = input.substring(m.start(),m.end());
        	System.out.println(output);        
        }
	
	}
	
	
	public void replaceText() {
		String input = "";		
		String patternString = "";		
		String replacementText = "";
		
		input.replaceAll(patternString, replacementText);
		System.out.println(input);
	}

}
