public class InOrder
{
	private int numOne;
	private int numTwo;
	private int numThree;
	
	public InOrder()
	{
    numOne = 0;
    numTwo = 0;
    numThree = 0;
	}
	
	public InOrder(int n1, int n2, int n3)
	{
		numOne = n1;
    numTwo = n2;
    numThree = n3;
	}
	
	public void setNumOne(int n1)
	{
    numOne = n1;
		
	}
	public void setNumTwo(int n2){
    numTwo = n2;
  }
	public void setNumThree(int n3){
    numThree = n3;
  }
	
	public int getNumOne()
	{
		return numOne;
	}
	public int getNumTwo(){
    return numTwo;
  }
  public int getNumThree(){
    return numThree;
  }
	public boolean whatsTheAnswer(){
    boolean answer = false;
    if((numOne <= numTwo) && (numTwo <= numThree)){
      answer = true;
    }
    return answer;
  }
	public void makeItCorrect(){
    int small = 0;
    int medium = 0;
    int big = 0;
    if((numOne <= numTwo) && (numOne <= numThree)){
      small = numOne;
      if(numTwo <= numThree){
        medium = numTwo;
        big = numThree;
      }
      if(numThree <= numTwo){
        medium = numThree;
        big = numTwo;
      }
    }
    if(!((numOne <= numTwo) && (numOne <= numThree))){
      if((numTwo <= numOne) && (numTwo <= numThree)){
        small = numTwo;
        if(numThree <= numOne){
          medium = numThree;
          big = numOne;
        }
        if(!(numThree <= numOne)){
          medium = numOne;
          big = numThree;
        }
      }
      if(!((numTwo <= numOne) && (numTwo <= numThree))){
        small = numThree;
        if(numTwo <= numOne){
          medium = numTwo;
          big = numOne;
        }
        if(!(numTwo <= numOne)){
          medium = numOne;
          big = numTwo;
        }
      }
    }
    numOne = small;
    numTwo = medium;
    numThree = big;
  }
	
	
	public String toString()
	{
		return "" + numOne + " " + numTwo + " " + numThree;
	}
}

