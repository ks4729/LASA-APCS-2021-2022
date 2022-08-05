import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numerator:");
    int num = input.nextInt();
    input.nextLine();
    System.out.println("Enter the denominator:");
    int denom = input.nextInt();
		GCD fraction = new GCD(num, denom);
		System.out.println(fraction.toString());
    System.out.println("The fraction in lowest terms is " + num/fraction.findCommonDivisor() + "/" + denom/fraction.findCommonDivisor());
		
	}
}