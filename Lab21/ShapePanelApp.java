import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ShapePanelApp{
  public static void main(String[]args){
    JFrame frame = new JFrame ("Shape Panel");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true); 
  }
}