import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

 public class WordSearchRunner {
	public static void wsMain(String fileName) throws FileNotFoundException
	{
		// instantiate Scanner object to read in from file
    System.out.println("Starting main");
		Scanner reader = new Scanner(new File(fileName));
    int rowLength = reader.nextInt();
    int columnLength = reader.nextInt();
    reader.nextLine();
    reader.nextLine();
    WordSearch crosswordWS = new WordSearch(rowLength, columnLength);
		// read in rows
		// read in columns
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		// loop through the rows in the file
			// loop through the columns in the file
				// read in value from file using local variable
				// pass row, column, and value into the 2D array
    String temp = "";
		for(int i = 0; i < rowLength; i++){
      for(int j = 0; j < columnLength; j++){
        temp = reader.next();
        crosswordWS.setSpot(temp, i, j);
      }
      reader.nextLine();
    }
    System.out.println("Done with array\n");
    System.out.println(crosswordWS.toString());
    int howManySearch = reader.nextInt();
		// read number of words to search for from file
		// loops through the words
		for(int i = 0; i < howManySearch; i++){
      reader.nextLine();
      String wordReading = reader.next();
      System.out.println(wordReading + " -> " + crosswordWS.inGrid(wordReading));
    }
			// read in word from file
			// method call to search for the word in the 2D array
			// print out word to search for and true/false
			
	}
}