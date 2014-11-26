package week10;

import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein;

public class Reasoning {
	
	public static void main(String[] args) {
		
		Reasoning reasoning = new Reasoning();
		
		String firstString = "";
		String secondString = "";		
		
		double similarity = reasoning.compareStrings(firstString, secondString);
		System.out.println(similarity);		
	}
	
	public double compareStrings(String firstString, String secondString) {
		Levenshtein levenshtein = new Levenshtein();
		double similarity = levenshtein.getSimilarity(firstString, secondString);			
		return similarity;
	}

}
