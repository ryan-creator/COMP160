package shapes;

import java.awt.*;

public class Circle extends Shape {
  
 /** Draws a circles */
  public void displayCircle(Graphics g) {
    g.setColor(colour);
    g.fillOval (x, y, width, height); 
  }
}