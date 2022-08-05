// name: Kushaal Singh 

public class Invoke 
{
   public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars){
     int money = pennies + 5*nickels + 10*dimes + 25 * quarters + 50 * halfDollars;
     return money;
   }
	

	 public static int mp3Sizer(int songs, int videos, int photos){
     double storageSize = 3.04*songs + 89.3*videos + 1.72*photos;
     storageSize /= 1000;
     storageSize = Math.ceil(storageSize);
     int placeholder = (int) storageSize;
     return placeholder;
   }
	
}