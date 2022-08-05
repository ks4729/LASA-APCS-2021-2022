// name: Kushaal Singh
// purpose: experience the thrill of methods

public class Task 
{
	public static int favorite() 
	{
    int theNumber = (( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1);
		return theNumber;
	}
	public static void wasted( double r, int d ) 
	{
    int dripsPerGallon = 15140;
    double waste = r * 60; //converted to dripsPerHour
    waste *= 24; //converted to dripsPerDay
    waste *= (double) d; //converted to total waste
    waste /= (double) dripsPerGallon;
    waste = (int) (waste + .5);
    System.out.println("A faucet with "+ r + " drips per minute over " + d + " days will waste " + (int) waste + " gallons of water.");
  }
	public static int count( double a, double b, int mL ) 
	{
    double jellybeanVolume = 5*a;
    jellybeanVolume *= Math.PI;
    b = Math.pow(b, 2);
    b /= 24;
    jellybeanVolume *= b;
    double numberOfBeans = (.698 * mL);
    numberOfBeans /= jellybeanVolume;
    return (int) numberOfBeans;
	}    
}
