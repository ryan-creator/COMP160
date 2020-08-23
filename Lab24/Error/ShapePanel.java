package shapes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel {
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel;
  
  DrawingPanel drawingPanel = new DrawingPanel();
  
  //Shape[] shape = new Shape [20];
  ArrayList<Shape> shape = new ArrayList<Shape>();
  
  JButton[] buttons = new JButton[7];
  
  int count;
  Timer timer;
  private final int DELAY = 10;
  
  /** ShapePanel Constructor */
  public ShapePanel(){
    controlPanel = new JPanel();
    showNum = new JTextField(2); 
    countLabel = new JLabel("Count");
    
    // Creates the listeners
    ButtonListener listener = new ButtonListener(); 
    timer = new Timer(DELAY, listener);
    
    //creates the buttons
    String[] label = {"Circle", "Square", "Oval", "Smiley", "Swirl", "Start", "Stop"};
    for (int i = 0; i < buttons.length; i++){
      buttons[i] = new JButton(label[i]);
    }
    for (JButton button : buttons){
      button.addActionListener(listener);
      controlPanel.add(button);
    }
    
    //adds the control panel
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    add(controlPanel);
    add(drawingPanel);
    
    // Creates the dimensions
    controlPanel.setPreferredSize(new Dimension(100,400));
    
  }// class end
  
  
  /** Action Listener */
  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      if (event.getSource() == timer){
        
        for (Shape s : shape){
          s.move();
        }
        
        
        
      } else {
        JButton button = (JButton) event.getSource();
       
          
          if (button.getText().equals("Circle")){
            
            shapes.add(new Circle());
            
          }
          else if (button.getText().equals("Square")){
            
            shapes.add(new Square());
            
          }
          else if (button.getText().equals("Smiley")){
            
            shapes.add(new Smiley());
            
          }
          else if (button.getText().equals("Swirl")){
            
            shapes.add(new Swirl());
            
          }
          else if (button.getText().equals("Oval")){
            
            shapes.add(new Oval());
            
          }
          showNum.setText("" + count); 
        }// if end
        if (button.getText().equals("Start")){
          timer.start();
        }
        if (button.getText().equals("Stop")){
          timer.stop();
        }
      }// else end
      drawingPanel.repaint();
    }// method end
  }// class end
  
  
  private class DrawingPanel extends JPanel {
    
    /** DrawingPanel Constructor */
    public DrawingPanel() {
      setPreferredSize(new Dimension(400,400));
      setBackground (Color.pink);
    } // method end
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
          for (Shape s : shape){
            s.display(g);
          }
    }// method end
  } // class end