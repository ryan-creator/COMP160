import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2018 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      //your pie chart code goes here
      final int x = 80;
      final int y = 25;
      final int WidthHeight = 150;
      final int Angle = 45;
      
      page.setColor (Color.red);
      page.fillArc (x + 5, y - 2, WidthHeight, WidthHeight, 0, Angle);   
      
      page.setColor (Color.green);
      page.fillArc (x,y, WidthHeight, WidthHeight, 45, Angle);
                    
      page.setColor (Color.yellow);
      page.fillArc (x,y, WidthHeight, WidthHeight, 90, Angle);
      
      page.setColor (Color.pink);
      page.fillArc (x,y, WidthHeight, WidthHeight, 135, Angle);
                    
      page.setColor (Color.orange);
      page.fillArc (x,y, WidthHeight, WidthHeight, 180, Angle);
                    
      page.setColor (Color.red);
      page.fillArc (x,y, WidthHeight, WidthHeight, 225, Angle);
                    
      page.setColor (Color.blue);
      page.fillArc (x,y, WidthHeight, WidthHeight, 270, Angle);
                    
      page.setColor (Color.black);
      page.fillArc (x,y, WidthHeight, WidthHeight, 315, Angle);
    }
}