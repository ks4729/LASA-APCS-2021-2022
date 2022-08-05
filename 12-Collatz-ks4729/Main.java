// Test you Collatz object
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner hello = new Scanner(System.in);
    
    System.out.print("Starting Number ");
    int start = hello.nextInt();
    Collatz hi = new Collatz(start);
    hello.nextLine();
    System.out.println("Starting Number " + start + " takes " + hi.steps() + " steps");
    System.out.println("Number of steps " + hi.steps());
    System.out.println("Maximum value " + hi.maxValue());
    System.out.println("Minimum odd value " + hi.minOddValue());
    System.out.println("Odd values " + Arrays.toString(hi.oddValues()));
    System.out.println("Sum of all values " + hi.sumValues());
    System.out.println(hi.toString(hi.sequence()));

  }
}