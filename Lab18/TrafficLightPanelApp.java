import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TrafficLightPanelApp{
  public static void main(String[]args){
    JFrame frame = new JFrame ("Traffic Light");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TrafficLightPanel());
    frame.pack();
    frame.setVisible(true); 
  }
}