import java.awt.*;
import javax.swing.*;

public class TablePanel extends JPanel{
  private Diner diner1;
  private Diner diner2;
  private Diner diner3;
  private Diner diner4;
  private Diner diner5;
  private Diner diner6; 
  private final int MIDDLE = 120;
  private final int TOP = 60;
  
  /** Creates each diner*/
  public TablePanel(){
    diner1 = new Diner(MIDDLE, TOP-10, "Jeff", 1, Color.blue);
    diner2 = new Diner(MIDDLE+60, TOP+50, "Sarah", 2, Color.pink);
    diner3 = new Diner(MIDDLE+60, TOP+120, "Josh", 3, Color.blue);
    diner4 = new Diner(MIDDLE, TOP+160, "Alex", 4, Color.pink);
    diner5 = new Diner(MIDDLE-60, TOP+120,"Logan", 5, Color.blue);
    diner6 = new Diner(MIDDLE-60, TOP+50, "Cara", 6, Color.pink);
    setPreferredSize(new Dimension (300,300));
    setBackground(Color.yellow);
  }
  
  /** Sends the diner objects to the draw method*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.fillRect(MIDDLE, TOP+50, 50, 100);
  }
}