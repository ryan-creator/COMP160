package shapes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapePanel extends JPanel {
  private JPanel controlPanel;
  private JButton addShape, start, stop;
  private JTextField showNum;
  private JLabel countLabel;
  DrawingPanel drawingPanel = new DrawingPanel();
  private Shape[] shape = new Shape [20];
  private int count;
  Timer timer;
  private final int DELAY = 10;
  
  /** ShapePanel Constructor */
  public ShapePanel(){
    controlPanel = new JPanel();
    addShape = new JButton ("Add Shape");
    showNum = new JTextField(2); 
    countLabel = new JLabel("Count");
    start = new JButton ("Start");
    stop = new JButton ("Stop");
    
    
    //adds the control panel
    controlPanel.add(addShape);
    controlPanel.add(start);
    controlPanel.add(stop);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel);
    add(drawingPanel);
    
    // Creates the dimensions
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    // Creates the listeners
    ButtonListener listener = new ButtonListener(); 
    addShape.addActionListener(listener);
    start.addActionListener(listener);
    stop.addActionListener(listener);
    timer = new Timer(DELAY, listener);
  }// class end
  
  
  /** Action Listener */
  private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent event){
        
        if (event.getSource() == timer){
          for (int i = 0; i < count; i++){
            shape[i].move();
            shape[i].colourChange();
          }// for end
        } else if (event.getSource() == addShape && count < shape.length){
          shape[count] = new Shape();
          count++;
        }
        
        showNum.setText("" + count); 
        drawingPanel.repaint();
        
        if (event.getSource() == start){
          timer.start();
        }// start end
        if (event.getSource() == stop){
          timer.stop();
        }// stop end 
      }// if end
    }// class end
  
  
  private class DrawingPanel extends JPanel {
    
    /** DrawingPanel Constructor */
    public DrawingPanel() {
      setPreferredSize(new Dimension(400,400));
      setBackground (Color.pink);
    } // method end
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
        for(int i = 0; i < count; i++){
          shape[i].displayCircle(g);
        }
    }// method end
  } // class end
}// class end