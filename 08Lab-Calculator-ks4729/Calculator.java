public class Calculator
{
  private double num1;
  private double num2;
  private char operator;
  
  public Calculator()
  {
    num1 = 0;
    num2 = 0;
    operator = '0';
  }
  public Calculator(char op, double one, double two){
   operator = op;
   num1 = one;
   num2 = two;
 }
  
  public void setNum1(double n1)
  {
    num1 = n1;
  }
  
  public void setNum2(double n2)
  {
    num2 = n2;
  }
  
 public void setOperator(char op){
   operator = op;
 }
 
  public double getNum1()
  {
    return num1;
  }
  
  public double getNum2()
  {
    return num2;
  }
  
 public char getOperator(){
   return operator;
 }
 
 public double calculatoring(){
   if(operator == '+'){
     return num1 + num2;
   }
   else if(operator == '-'){
     return num1 - num2;
   }
   else if(operator == '*'){
     return num1 * num2;
   }
   else if(operator == '/'){
     return num1 / num2;
   }
   else {
     return 0;
   }
 }
 
 public String toString(){
   return ""+ num1 + " " + operator + " " + num2 + " = "+calculatoring();
 }
 
  
  
}
