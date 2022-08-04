import java.util.Scanner;
public class Main{
  public static double wasteCalculator(double a, int b){
    int dripsPerGallon = 15140;
    double waste = a*60; //converted to dripsPerHour
    waste *= 24; //converted to dripsPerDay
    waste *= (double) b; //converted to total waste
    waste /= (double) dripsPerGallon;
    return waste;
  }
  public static void main(String[] args){
    Scanner timeFinder = new Scanner(System.in);
    double dripsPerMinute;
    int daysDripping;
    double gallonsWasted;

    System.out.println("Enter faucet drips per minute:");
    dripsPerMinute = timeFinder.nextDouble();
    timeFinder.nextLine();
    System.out.println("Enter number of days:");
    daysDripping = timeFinder.nextInt();

    gallonsWasted = wasteCalculator(dripsPerMinute, daysDripping);
    System.out.println("A faucet with " + dripsPerMinute + 
    " drips per minute over " + daysDripping + " days will waste " + gallonsWasted + " gallons of water");

  }
}