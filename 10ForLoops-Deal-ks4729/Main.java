import java.util.Scanner;

// DealRunner
public class Main
{
	public static void main(String[] args)
	{
		Scanner montyHall = new Scanner(System.in);
		
    System.out.println("How many simulations do you want to run?");
		int timesPlay = montyHall.nextInt();
    montyHall.nextLine();
    int winsByChange = 0;
    int lossByChange = 0;

      Deal playthrough = new Deal();

		for(int i = timesPlay; i>0; i--){
      
      System.out.print("prize: " + playthrough.getPrizeLoc() + "\t");

      System.out.print("guess: " + playthrough.getUserGuess() + "\t");

      System.out.print("revealed: " + playthrough.revealWrong() + "\t");
      playthrough.switchGuess();
      System.out.print("guess: " + playthrough.getUserGuess() + "\t");

      System.out.print("win if switching:" + (playthrough.getUserGuess() == playthrough.getPrizeLoc()) + "\t");
      System.out.println("if not switching:" + !(playthrough.getUserGuess() == playthrough.getPrizeLoc()) + "\t");
      if((playthrough.getUserGuess() == playthrough.getPrizeLoc())){
        winsByChange++;
      }
      else{
        lossByChange++;
      }
      playthrough.reset();
    }
    System.out.println("Probability of winning if you switch: " + ((double)winsByChange/timesPlay));
    System.out.println("Probability of winning if you do not switch: " + ((double)lossByChange/timesPlay));
	}
}