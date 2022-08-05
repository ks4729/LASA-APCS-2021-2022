// If you are doing this correctly your code should not be more then 125 lines
// (including comments & blank lines separating the methods).
public class Collatz {
  private int startNum;
	// instance variables (aka members, fields)
  public Collatz() {
    startNum = 1;
  }
   // default constructor
   public Collatz(int i){
     startNum = i;
   }
   // initialization constructor
   public int steps(){
     int temp = startNum;
     int num = 1;
     while(temp != 1){
      if((temp%2)==0){
        temp /= 2;
      }
      else{
        temp *= 3;
        temp += 1;
      }
       num++;
     }
     return num;
   }
   // Add a method called steps() that returns the number of steps 
   // that are required for the starting number to reach 1.
   public int[] sequence(){
     int[] stepping = new int[steps()];
     stepping[0] = startNum;
     int i;
     for(int amount = 1; amount < stepping.length; amount++){
       i = stepping[amount-1];
       if((i%2)==0){
        i /= 2;
        }
        else{
          i *= 3;
          i += 1;
         }
         stepping[amount] = i;
      }
     return stepping;
   }
   // Add a method called sequence() that returns an array of the sequence of 
   // numbers from the starting number to 1. Use your steps() function to 
   // determine how the size of your array.
    public int maxValue(){   
     int[] temp = sequence();
     int highest = 1;
     for(int amount = 0; amount < (steps()-2); amount++){
       if(highest < temp[amount]){
         highest = temp[amount];
       }
      }
     return highest;
   }
   // Add a method called maxValue() that returns the maximum value in the sequence.
   // Iterate through the values returned by a call to sequence().
  public int minOddValue(){
    int[] temp = oddValues();
    int lowest = startNum;
    for(int amount = 0; amount < (temp.length-1); amount++){
      if((lowest > temp[amount])){
       lowest = temp[amount];
      }
    }
    return lowest;
  }
   // A method called minOddValue() that returns the minimum value of all the odd numbers, 
   // except for 1, in the sequence. Iterate through the values returned by a call to sequence().
  public int[] oddValues(){
     int length = 0;
     int sequencing[] = sequence();
     for(int i: sequencing){
       if((i%2) != 0){
         length++;
       }
     }
     int temp[] = new int[length];
     int whereWeAt = 0;
     for(int amount = 0; amount < (steps()); amount++){
       if(((sequencing[amount])%2) != 0){
         temp[whereWeAt] = sequencing[amount];
         whereWeAt++;
       }
     }
     return temp;
   }  
   // Add a method called oddValues() that returns an array of all the odd numbers in the sequence. 
   // Iterate through the values returned by a call to sequence().  
  public int sumValues(){
    int[] temp = sequence();
    int i = 1;
    for(int amount = 0; amount < (steps()-1); amount++){
      i += temp[amount];
    }
    return i;
  }
   // Add a method called sumValues() that returns the sum of all the values in the sequence.
   // Iterate through the values returned by a call to sequence().
  public String toString(int[] temp){
    String words = "";
    for(int amount = 0; amount < (steps()); amount++){
      words += "step " + (amount+1) + " " + temp[amount] + "\n";
    }
  return words;
  }
   // Add a toString() method that returns ...    Starting number # takes # steps
}

