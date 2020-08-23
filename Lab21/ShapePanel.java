import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapePanel extends JPanel {
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  DrawingPanel drawingPanel = new DrawingPanel();
  private Shape[] shape = new Shape [20];
  int count;
  
  /** ShapePanel Constructor */
  public ShapePanel(){
    controlPanel = new JPanel();
    addShape = new JButton ("Add Shape");
    showNum = new JTextField(2); 
    countLabel = new JLabel("Count");
    
    //adds the control panel
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel);
    add(drawingPanel);
    
    // Creates the dimensions
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    // Creates the listeners
    ButtonListener listener = new ButtonListener(); 
    addShape.addActionListener(listener); 
  }// class end
  
  /** Action Listener */
  private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent event){
        if (event.getSource() == addShape && count < shape.length){
          shape[count] = new Shape();
          count++;
        }
        showNum.setText("" + count); 
        drawingPanel.repaint();
      }
    }// class end
  
  private class DrawingPanel extends JPanel {
    
    /** DrawingPanel Constructor */
    public DrawingPanel() {
      setPreferredSize(new Dimension(400,400));
      setBackground (Color.pink);
    } // method end
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
     // if (count > 0){
        for(int i = 0; i < count; i++){
          shape[i].display(g);
        }
     // }
    }// method end
  } // class end
}// class end