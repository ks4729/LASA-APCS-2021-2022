import java.util.Scanner;
import java.io.*;
class Main{

	public static void main(String[] args) throws FileNotFoundException {
    Scanner reader = new Scanner(new File("alice.txt"));
      // instantiate Scanner object using text file "alice.txt".

    PrintWriter writerA = new PrintWriter("outputA.txt");
    PrintWriter writerE = new PrintWriter("outputE.txt");
    PrintWriter writerI = new PrintWriter("outputI.txt");
    PrintWriter writerO = new PrintWriter("outputO.txt");
    PrintWriter writerT = new PrintWriter("outputT.txt");
      // instatiate PrintWriter with output file name

    int totalWords = -3;
      // create variable to track the number of words in the text
    int letA = -3;
    int letE = -2;
    int letI =-2;
    int letO = 0;
    int letT = -2;
    
    String wordReading;
      // loop through the file		
    while(reader.hasNext()){
      wordReading = reader.next();
      totalWords++;
      if(wordReading.indexOf('a') != -1 || wordReading.indexOf('A') != -1){
        letA++;
        writerA.print(wordReading);
      }
      if(wordReading.indexOf('e') != -1 || wordReading.indexOf('E') != -1){
        letE++;
        writerE.print(wordReading);
      }
      if(wordReading.indexOf('i') != -1 || wordReading.indexOf('I') != -1){
        letI++;
        writerI.print(wordReading);
      }
      if(wordReading.indexOf('o') != -1 || wordReading.indexOf('O') != -1){
        letO++;
        writerO.print(wordReading);
      }
      if(wordReading.indexOf('t') != -1 || wordReading.indexOf('T') != -1){
        letT++;
        writerT.print(wordReading);
      }
      
    }
      
        // read in the word one at a time

        
        // increment the word counter

        
        // check to see if the letter occurs in the word

        
          // increment the letter counter

          
          // write the word to the output file
        
      
      // calculate the percentage of words containing the character
      System.out.println("Words with the letter 'e' = " + letE);
      System.out.println("Total number of Words = " + totalWords);
      System.out.println("Percentage of words containing the letter 'e' is " +  Math.round((double)letE/totalWords * 10000)/(double)100 + "%");
      System.out.println("Percentage of words containing the letter 't' is " + Math.round((double)letT/totalWords * 10000)/(double)100 + "%");
      System.out.println("Percentage of words containing the letter 'a' is " + Math.round((double)letA/totalWords * 10000)/(double)100 + "%");
      System.out.println("Percentage of words containing the letter 'o' is " + Math.round((double)letO/totalWords * 10000)/(double)100 + "%");
      System.out.println("Percentage of words containing the letter 'i' is " + Math.round((double)letI/totalWords * 10000)/(double)100 + "%");

      
      //  close the files
  }
}