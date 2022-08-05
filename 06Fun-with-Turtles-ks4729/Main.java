import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);
    World turtleWorld = new World(600, 800);

    Turtle yertle = new Turtle(world);

    Turtle deb = new Turtle(turtleWorld);
    Turtle tim = new Turtle(50, 50, turtleWorld);

    /*deb.forward(50);
    deb.turnLeft();
    deb.forward(50);
    deb.turnLeft();
    deb.forward(50);
    deb.turnLeft();
    deb.forward(50);

    tim.forward(-300);
    tim.turn(60);
    tim.forward(300);
    tim.turn(240);
    tim.forward(300);*/

    Turtle joe = new Turtle(300, 150, turtleWorld);

    tim = joe;

    deb.square();
    joe.triangle();
    //Picture turtlePic = new Picture("images.jpg");


    Turtle dot = new Turtle(turtleWorld);
    dot.shape(5, 75);
    dot.penUp();
    dot.forward(30);
    dot.penDown();
    dot.shape(6, 75);
    dot.forward(75);
    dot.turn(180);
    dot.messingAround(10, 75);
    dot.turnToFace(30, 30);
    dot.penUp();
    dot.forward(200);
    yertle.forward();
    yertle.turnRight();
    delaySeconds(4);
    yertle.forward();

  
    world.setVisible(true);
  }

  public static void delaySeconds(int d)
  {
    try {
      TimeUnit.SECONDS.sleep(d);
    }
    catch(InterruptedException exception) {
            // Output expected InterruptedExceptions.
            System.out.println("Exception: "+exception);
        } catch (Exception exception) {
            // Output unexpected Exceptions.
            System.out.println("Exception: "+exception+", "+false);
        }
  }

}
