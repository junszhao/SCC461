package week6;

public class Variables {

	public static void main(String[] args) {
		
		String coursePneumonic = "SCC460";
		String courseTitle = "Data Science Fundamentals";
		String fullTitle = coursePneumonic + " - " + courseTitle;

		int charLimit = 10;
		if(coursePneumonic.length() <= charLimit) {
			System.out.println(coursePneumonic);
		}
		if(courseTitle.length() <= charLimit) {
			System.out.println(courseTitle);
		}
		if(fullTitle.length() <= charLimit) {
			System.out.println(fullTitle);
		}
		
	}
}
