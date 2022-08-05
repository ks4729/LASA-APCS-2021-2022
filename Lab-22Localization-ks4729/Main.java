import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import  java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayList<AbstractLocale> locales = getLocales();
    // Your code goes here.
    Scanner reader = new Scanner(System.in);
    
    for(int i = 0; i < locales.size(); i++){
      System.out.println(locales.get(i).getLocation() + " (" + locales.get(i).getLanguage() + ")");
    }
    System.out.println("What locale do you want?");
    String placement = reader.nextLine();
    int whichPlacement = 0;
    for(int i = 0; i < locales.size(); i++){
      if(locales.get(i).getLocation().equals(placement)){
        whichPlacement = i;
        break;
      }
    }
    System.out.println(locales.get(whichPlacement).getGreeting());
    System.out.println("What is the hour");
    int tempHour = reader.nextInt();
    reader.nextLine();
    System.out.println("What is the minute");
    int tempMin = reader.nextInt();
    reader.nextLine();
    System.out.println("The local time is: " + locales.get(whichPlacement).getLocalTime(tempHour, tempMin));
    System.out.println("How much money do you have in your wallet or purse? ");
    double moneys = reader.nextDouble();
    System.out.println("In " + locales.get(whichPlacement).getLocation() + ", that’s worth " + locales.get(whichPlacement).getCurrencySymbol() + locales.get(whichPlacement).getCurrencyValue(moneys));
    
  }

  /**
   * DO NOT MODIFY THIS METHOD.
   * Scans the directory of your .java file for all implementations of
   * AbstractLocale, instantiates them, and puts them in an ArrayList.
   * @return the list of locale implementations.
   */
  public static ArrayList<AbstractLocale> getLocales() {
    ArrayList<AbstractLocale> locales = new ArrayList<AbstractLocale>();
    File pwd = new File(
        ClassLoader.getSystemClassLoader().getResource("").getPath());
    File[] classFiles = pwd.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
          return name.endsWith(".class");
        }});
    for(File f : classFiles) {
      String className = f.getName().replace(".class", "");
      try {
        Class<?> c = Class.forName(className);
        if (!c.getName().equals("AbstractLocale")) {
          Object obj = c.newInstance();
          if (obj instanceof AbstractLocale)
            locales.add((AbstractLocale)obj);
        }
      } catch (ClassNotFoundException e) {
        System.err.println("Class not found: " + className);
      } catch (InstantiationException e) {
        System.err.println("Error instantiating the object: " + className);
      } catch (IllegalAccessException e) {
        System.err.println("Invalid method access for " + className);
      }
    }
    return locales;
  }
}
