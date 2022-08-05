/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

DO NOT CHANGE THIS CODE.

 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException
  {
    String fName = "";
    System.out.println("Word Search!");
    WordSearchRunner wsrun = new WordSearchRunner();
    Scanner scan = new Scanner(System.in);
    fName = scan.nextLine();
    if (fName != "")
      wsrun.wsMain(fName);
  }
}

