public class Deal
{
	private int prizeLoc;
	private int userGuess;
	
	public Deal()
	{
		setPrizeLoc();
		setUserGuess();
	}
  public void reset(){
		setPrizeLoc();
		setUserGuess(); 
  }
  public void setPrizeLoc() {
    prizeLoc = what();
  }
  public void setUserGuess() {
    userGuess = what();
  }

	public int getUserGuess() {
    return userGuess;
  }
  public int getPrizeLoc() {
    return prizeLoc;
  }
	public int what(){
    return ((int)(Math.random()*3)+1);
  }
	public int revealWrong(){
    if((prizeLoc != 1)&&(userGuess != 1)){
      return 1;
    }
    else if((prizeLoc != 2)&&(userGuess != 2)){
      return 3;
    }
    else if((prizeLoc != 3)&&(userGuess != 3)){
      return 3;
    }
    else{
      return 5000;
    }
  }
	public void switchGuess(){
    if((revealWrong() != 1)&&(userGuess != 1)){
      userGuess = 1;
    }
    else if((revealWrong() != 2)&&(userGuess != 2)){
      userGuess = 2;
    }
    else if((revealWrong() != 3)&&(userGuess != 3)){
      userGuess = 3;
    }
    else{
      userGuess = 500000;
    }
  }
	
	
	public String toString()
	{
		return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
	}
}
