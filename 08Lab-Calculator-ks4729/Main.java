 
import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    double num1;
    double num2;
    char operator;
    
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the operator:");
  String opstring = scan.nextLine();
  operator = opstring.charAt(0);
 
 if((operator == '+')||(operator == '*')||(operator == '/')||(operator == '-')){
  
  System.out.println("Enter the first operand:");
  num1 = (double) scan.nextDouble();
  scan.nextLine();
  System.out.println("Enter the second operand:");
  num2 = (double) scan.nextDouble();
 
  if((num2 == 0)&&(operator == '/')){
    System.out.println("Cannot Divide by Zero");
  }
  else{
    Calculator thingy = new Calculator(operator, num1, num2);
    System.out.println("result = " + thingy.calculatoring());
    System.out.println(thingy.toString());
  }
  }
  else{
    System.out.println("Invalid Operator");
  }
  }
}
 
