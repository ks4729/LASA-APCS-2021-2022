import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner aboutYou = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = aboutYou.nextLine();
    System.out.println("Hello " + (name) + "!");

    System.out.println("How old are you?");
    int ageInMonths = aboutYou.nextInt();
    ageInMonths *= 12;
    aboutYou.nextLine();
    System.out.println("Your age in months is " + (ageInMonths) + ".");
    
    System.out.println("What is your favorite band?");
    String bandFav = aboutYou.nextLine();
    System.out.println("What is your 2nd favorite band?");
    String band2Fav = aboutYou.nextLine();
    System.out.println("I like " + (bandFav) + " and " + (band2Fav) + " too!!!");

  }
}