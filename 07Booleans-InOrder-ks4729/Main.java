import java.util.Scanner;

public class Main
{
	public static void main( String[] args ) 
	{
		Scanner numbers = new Scanner(System.in);


		System.out.print( "Enter x, y, and z:" );
		int first = numbers.nextInt();
    int second = numbers.nextInt();
    int third = numbers.nextInt();
    numbers.nextLine();

    InOrder creativeName = new InOrder(first, second, third);
		
		System.out.println("\n" + first + " <= " + second + " <= " + third + " is\n" + creativeName.whatsTheAnswer());
		
		creativeName.makeItCorrect();
    first = creativeName.getNumOne();
    second = creativeName.getNumTwo();
    third = creativeName.getNumThree();

		System.out.println("The correct order is " + first + " <= " + second + " <= " + third);
    }
}