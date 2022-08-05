public class Main{ 
public static void main( String[] args    ) 
   {
      System.out.println("Running main() in Tasking class!\n");
      System.out.println("Trying mission()");
      mission();
     
     System.out.println("");

      System.out.println("Trying favorite()");
      System.out.println("nbr1=" + Task.favorite());
      System.out.println("nbr2=" + Task.favorite());
      
     System.out.println("");
     
      System.out.println("Trying wasted()");
      double dpm = 3.75;
      int day = 30;
      Task.wasted(dpm,day);
      Task.wasted( 7.50,  5 );
      
     System.out.println("");
     
      System.out.println("Trying count()");
      System.out.println("Task.count(1.5,0.9,500): "+ Task.count( 1.5, 0.9, 500 )+ " beans");
      System.out.println("Task.count(2.0,1.0,25): "+ Task.count( 2.0, 1.0,  25 ) + " beans");
         
     System.out.println("");
     
   }
  public static void mission() {
    System.out.println("The Liberal Arts and Science Academy cultivates responsible leaders, problem solvers, and thinkers by offering a nationally recognized, rigorous, innovative, evolving curriculum.");
	}
}