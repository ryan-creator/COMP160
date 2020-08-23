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
  
  /** changes colour of the shape*/
  public void colourChange(){
    if (r == 255 || r == 0){
      rchange *= -1;
    }
    if (g == 255  || g == 0){
      gchange *= -1;
    }
    if (b == 255  || b == 0){
      bchange *= -1;
    }
    
    colour = new Color(r += rchange, g += gchange, b += bchange);
  }
  
  
}
  