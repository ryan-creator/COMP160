package shapes;

import java.awt.*;

public class Square extends Shape {
  
 /** Draws a square */
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillRect (x, y, width, height); 
  }
}