import java.util.Arrays;
public class WordSearch
{
  char[][] crossword;
	/** One 2D array instance variable */
	/*  You CANNOT add any additional instance variables */
	
	
	/** constructor used to set the number of rows and columns in the 2D array
		* @param row
		* @param col*/
	public WordSearch(int row, int col)
	{
		crossword = new char[row][col];
	}
	
	/** method to set an element in the 2D array
		* @param s which is the value to store in the 2D array
		* @param row the row to use
		* @param col the column to use*/
	public void setSpot(String s, int row, int col)
	{
    crossword[row][col] = s.charAt(0);
	}
	
	/** methods to check for the word in the 2D array
		* @param word the word to search for
		* @return return true or false*/
	public boolean inGrid(String s)
	{
    String backwardsS = "";
    char[] sArray = s.toCharArray();
    for(int i = sArray.length-1; i >= 0; i--){
      backwardsS += sArray[i];
    }
    String noSpaces = "";
    for(int i = 0; i < crossword.length; i++){
      for(int j = 0; j < crossword[i].length; j++){
        noSpaces += crossword[i][j];
      }
      noSpaces += 1;
    }
    if((noSpaces.indexOf(s) != -1)||(noSpaces.indexOf(backwardsS) != -1)){
      return true;
    }
    else {
      noSpaces = "";
      for(int i = 0; i < crossword[0].length; i++){
        for(int j = 0; j < crossword.length; j++){
          noSpaces += crossword[j][i];
        }
        noSpaces += 1;
      }
      if((noSpaces.indexOf(s) != -1)||(noSpaces.indexOf(backwardsS) != -1)){
        return true;
      }
      else {
        return false;
      }
    }
	}
	
	/** toString method
		* @return String containing all elements in the 2D array*/
	public String toString()
	{
		String everything = "[";
    for(int i = 0; i < crossword.length; i++){
      if(i > 0){
        everything += " ";
      }
      everything += "[";
      for(int j = 0; j < crossword[i].length; j++){
        everything +=  crossword[i][j];
        if(j < crossword[i].length-1){
          everything += " ";
        }
      }
      everything += "]";
      if(i < crossword.length-1){
        everything += "\n";
      }
    }
    return everything + "]\n";
	}
}