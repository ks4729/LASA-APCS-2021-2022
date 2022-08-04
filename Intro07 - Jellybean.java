import java.util.Scanner;
public class Main{
  public static double jellybeanVolumeCalculator(double length, double height){
    double jellybeanVolume = 5*length;
    jellybeanVolume *= Math.PI;
    height = Math.pow(height, 2);
    height /= 24;
    jellybeanVolume *= height;
    return jellybeanVolume;
  }
  public static double volumeToBean(int jarSize, double jellybeanVolume){
    double numberOfBeans = (.698 * jarSize);
    numberOfBeans /= jellybeanVolume;
    return numberOfBeans;
  }
  public static void main(String[] args){
    Scanner jellybeanInput = new Scanner(System.in);
    double length;
    double height;
    int jarSize;

    System.out.println("Enter jelly bean length (cm):");
    length = jellybeanInput.nextDouble();
    jellybeanInput.nextLine();
    System.out.println("Enter jelly bean height (cm):");
    height = jellybeanInput.nextDouble();
    jellybeanInput.nextLine();
    System.out.println("Enter jar size (mL):");
    jarSize = jellybeanInput.nextInt();
    jellybeanInput.nextLine();

    double jellybeanVolume = jellybeanVolumeCalculator(length, height);
    int numberOfBeans = (int) volumeToBean(jarSize, jellybeanVolume);

    System.out.println("Estimate for number of jelly beans with average");
    System.out.println("length: " + length + " cm");
    System.out.println("height: " + height + " cm");
    System.out.println("in a jar of size " + jarSize + " mL is");
    System.out.println(numberOfBeans);
  }
}