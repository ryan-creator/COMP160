package shapes;

import java.util.Random;
import java.awt.*;

public abstract class Shape {
  protected int x, y, width, height;
  protected Color colour;
  private int moveX = 1;
  private int moveY = 1;
  private int r,g,b;
  private int rchange, gchange, bchange = 1;
  
  Random generator = new Random();
  
  /** Class Constructor */
  public Shape() {
    this.width = randomRange(10,30);
    this.height = width;
    this.x = randomRange(0,(400-width));
    this.y = randomRange(0,(400-height));
    r = randomRange(0,255);
    g = randomRange(0,255);
    b = randomRange(0,255);
    this.colour = new Color(r,g,b);
  }
  
  public abstract void display(Graphics g);
  
  /** Draws an integer above the shape */
  public void showIndex(Graphics g, int i){
    g.setColor(Color.black);
    g.drawString(Integer.toString(i), x, y);
  }
  
  /** Creates a random number between low and high variable. */
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high - low + 1) + low;
  }
  
  /** This changes the location at which the shape will be drawn by 1 pixel */
  public void move(){
    if(x == 0 || x == (400-width)){
      moveX *= -1;
    }
    if(y == 0 || y == (400-height)){
      moveY *= -1;
    }
    x += moveX;
    y += moveY;
  }// move end
  
}
  