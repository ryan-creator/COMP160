import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLightPanel extends JPanel{
  private JButton red, amber, green;
  private JLabel lastPressed; 
  private JPanel buttonPanel;
  
  public TrafficLightPanel(){
    
    red = new JButton("Red");
    amber = new JButton("Amber");
    green = new JButton("Green");
    lastPressed = new JLabel("Last Pressed");
    buttonPanel = new JPanel();
    
    // adds the buttons and labels
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);
    //buttonPanel.add(lastPressed);
    add(buttonPanel);
    
    // Creates the dimensions
    buttonPanel.setPreferredSize(new Dimension(80,290));
    setPreferredSize(new Dimension(200,300));
    
    // Sets the backgrounds colours
    setBackground(Color.blue);
    buttonPanel.setBackground(Color.white);
    
    // Creates the listeners
    ButtonListener listener = new ButtonListener(); 
    red.addActionListener(listener); 
    amber.addActionListener(listener); 
    green.addActionListener(listener);
    
    lightPanel lightPanel = new lightPanel();
    add(lightPanel);
    
  }// class end   
    
    private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent event){
        if (event.getSource() == red){         
          lastPressed.setText("Red");         
        }else if (event.getSource() == amber){ 
          lastPressed.setText("Amber");      
        }else{           
          lastPressed.setText("Green"); 
        } 
        repaint(); 
      }
    }// class end
    
    private class lightPanel extends JPanel { 
      public lightPanel(){ 
        setPreferredSize(new Dimension(80, 290)); 
        setBackground(Color.cyan); 
      } 
 
      public void paintComponent (Graphics page){ 
        super.paintComponent(page); 
        page.setColor (Color.black); 
        page.fillOval (20, 30, 40, 40); 
        page.fillOval (20, 80, 40, 40); 
        page.fillOval (20, 130, 40, 40); 
        
        
        if (lastPressed.getText().equals("Red")) { 
          page.setColor (Color.red); 
          page.fillOval (20, 30, 40, 40); 
        }else if (lastPressed.getText().equals("Amber")){ 
          page.setColor (Color.orange); 
          page.fillOval (20, 80, 40, 40); 
        }else if (lastPressed.getText().equals("Green")){ 
          page.setColor (Color.green); 
          page.fillOval (20, 130, 40, 40); 
        }
      } 
    }
}
