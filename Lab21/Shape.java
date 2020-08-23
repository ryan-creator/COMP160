import java.util.Random;
import java.awt.*;

public class Shape {
  private int x, y, width, height;
  private Color colour;
  
  Random generator = new Random();
  
  public Shape() {
    this.width = randomRange(10,30);
    this.height = width;
    this.x = generator.nextInt(400-width);
    this.y = generator.nextInt(400-height);
    int r = generator.nextInt(255);
    int g = generator.nextInt(255);
    int b = generator.nextInt(255);
    this.colour = new Color(r,g,b);
  }
  
  /** Draws the circles */
  public void display(Graphics g) {
    g.setColor(colour);
    g.fillOval (x, y, width, height); 
  }
  
  /** Creates a random number between low and high variable. */
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high - low + 1) + low;
  }
}