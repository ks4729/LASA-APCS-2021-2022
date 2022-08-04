import java.util.Scanner;
public class Main{
   public static int bestTime(int input){
     int time = 7+(input/2);
     return time;
   }
   public static void main( String[] args ) 
   {
      Scanner tasteable = new Scanner(System.in);
      int shelfLife;
      int whenEat;

      System.out.println("Enter the shelf life:");
      shelfLife = tasteable.nextInt(); 
      
      whenEat = bestTime(shelfLife);
      System.out.println(shelfLife + " week shelf life tastes best when it is at least " + whenEat + " weeks old");      
   }
}