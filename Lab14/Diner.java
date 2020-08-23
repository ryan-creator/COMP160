import java.awt.*;
import javax.swing.*;

public class Diner{
  private int x; 
  private int y;
  private String name;
  private int seatNum;
  private Color colour = Color.BLUE;
  private final int DIAMETER = 50;
  
  /**New constructor sets inputs to the data feild*/
  public Diner(int x, int y, String name, int seatNum, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    this.colour = colour;
  }
  
  /**Draws each diner*/
  public void draw(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, DIAMETER, DIAMETER);
    g.setColor(Color.black);
    g.setFont( new Font ("Courier", Font.PLAIN, 8));
    g.drawString(name, x+15, y+30);
    g.setFont( new Font ("Courier", Font.PLAIN, 6));
    g.drawString(Integer.toString(seatNum),(x+25), (y+20));
  }
}