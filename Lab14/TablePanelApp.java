import javax.swing.*;

public class TablePanelApp{
  public static void main(String [] args){
    JFrame frame = new JFrame("Table Seating Plan");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    TablePanel table1 = new TablePanel();
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}