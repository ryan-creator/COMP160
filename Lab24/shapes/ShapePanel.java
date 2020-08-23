package shapes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel {
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel removeLabel; 
  DrawingPanel drawingPanel = new DrawingPanel();
  ArrayList<Shape> shape = new ArrayList<Shape>(); 
  JButton[] buttons = new JButton[8];
  Timer timer;
  private final int DELAY = 10;
  
  /** ShapePanel Constructor */
  public ShapePanel(){
    controlPanel = new JPanel();
    showNum = new JTextField(2); 
    removeLabel = new JLabel("Remove Which");
    
    // Creates the listeners
    ButtonListener listener = new ButtonListener(); 
    timer = new Timer(DELAY, listener);
    
    //creates the buttons
    String[] label = {"Circle", "Square", "Oval", "Smiley", "Swirl", "Start", "Stop", "Remove"};
    for (int i = 0; i < buttons.length; i++){
      buttons[i] = new JButton(label[i]);
    }
    for (JButton button : buttons){
      button.addActionListener(listener);
      controlPanel.add(button);
    }
    
    //adds the control panel
    controlPanel.add(removeLabel);
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
            shape.add(new Circle());
          }
          else if (button.getText().equals("Square")){
            shape.add(new Square());
          }
          else if (button.getText().equals("Smiley")){
            shape.add(new Smiley());
          }
          else if (button.getText().equals("Swirl")){
            shape.add(new Swirl());
          }
          else if (button.getText().equals("Oval")){
            shape.add(new Oval());
          }
          if (button.getText().equals("Remove")){
          try {
            int number = Integer.parseInt(showNum.getText());       
              shape.remove(number);
              
          }catch (NumberFormatException exception){
            System.out.println("please enter a number");
          }catch (IndexOutOfBoundsException exception){
            System.out.println("Number out of bounds");
          }
        }
          if (shape.size() > 0){
          showNum.setText(Integer.toString(shape.size() - 1));
          } else {
            showNum.setText("");
          }
          
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
          s.showIndex(g, shape.indexOf(s));
        }
    }// method end
  } // class end
}// class end