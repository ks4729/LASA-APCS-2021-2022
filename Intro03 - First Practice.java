class Main {
    
    final static int DAYS_PER_WEEK = 7;
    
    public static void main(String[] args) {
       int x;
       x = 27;
       System.out.println("x = " + x);
       x++;
       System.out.println("x = " + (x + 1));
       System.out.println("x = " + x);

       x = 2147483647;
       System.out.println("x = " + x);
       x++;
       System.out.println("x = " + (x + 1));
       System.out.println("x = " + x);

       System.out.println("x = " + Integer.MAX_VALUE);
       System.out.println("x = " + Integer.MIN_VALUE);

       double y = 6.2;
       System.out.println("y = " + y);
       y=27;
       System.out.println("y = " + y);

       char a = '$';
       System.out.println("a = " + a);
       a = '\'';
       System.out.println("a = " + a);

       String b = "Hello";
       String c = "World";
       System.out.print(b + "\n\\\n" + c + "\n");
      
      
       int days = 212;
       float amountOfWeeks = (float)days/DAYS_PER_WEEK;
       System.out.println(days + " days is " + amountOfWeeks + " weeks.");
       
      
       int e = 6;
       int f = 27;
       int total = e+f;
       System.out.println(e + " + " + f + " = " + total + " (not 627)");
       
       double g = 5.8*2;
       double h = 2.5;
       g /= h;
       int gh = (int) g;
      System.out.println("integer part of g / h = "+ gh);
    }
}
