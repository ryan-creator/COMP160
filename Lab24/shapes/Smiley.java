package shapes;

import java.awt.*;

public class Smiley extends Shape {
  
  public Smiley(){
    super();
    height = 30; 
    width = 30;
    y = randomRange(0, 400 - height);
    x = randomRange(0, 400 - width);
  }
  
 /** Draws a Smiley */
  public void display(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval (x, y, width, height); 
    g.setColor(Color.black);
    g.drawOval(x,y,width,height);
    g.fillOval(x+7,y+8,4,4);
    g.fillOval(x+20,y+8,4,4);
    g.drawArc(x+8,y+10,15,13,190,160);
  }
}