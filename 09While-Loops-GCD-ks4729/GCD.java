public class GCD
{
	private int numerator;
	private int denominator;
	
  public GCD(){
    numerator = 1;
    denominator = 1;
  }
	public GCD(int num, int denom){
    numerator = num;
    denominator = denom;
  }
	public void setNumerator(int num){
    numerator = num;
  }
	public void setDenominator(int denom){
    denominator = denom;
  }
	public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public int findCommonDivisor(){
    int i;
    if(numerator < denominator){
      i = numerator;
    }
    else{
      i = denominator;
    }
    while (!((numerator%i) == 0)||!((denominator%i)==0)){
      i--;
    }
    return i;
  }
  public int findCommonEuclid(){
    while(!(numerator == denominator)){
     if(numerator < denominator){
      denominator -= numerator;
     }
      else if(denominator < numerator){
       numerator -= denominator;
     }
    }
    return numerator;
  }
	public String toString(){
    return "The GCD is: " + findCommonEuclid();
  }
	
}