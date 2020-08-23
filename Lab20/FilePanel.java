/** FilePanel.java
  * Lab 20, COMP160,  2018
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    
    String fileName = "LongBadData.txt";
    Boolean fillRect;
    Color c;
    
    
    try {
      
      Scanner filescan = new Scanner(new File(fileName));// Creates Scanner object
      
      while(filescan.hasNextLine() && count < drawObjects.length){ // Continues throw the file if there is another line and there is still room in the array.
        
        String inputLine = filescan.nextLine();
        
        
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){//Checks if the input is correct data that can be read without errors.
         Scanner inputLinescan = new Scanner(inputLine);
          int fill = inputLinescan.nextInt();
          int colour = inputLinescan.nextInt();
          int x = inputLinescan.nextInt();
          int y = inputLinescan.nextInt();
          int width = inputLinescan.nextInt();
          int height = inputLinescan.nextInt();
        
          if (fill == 1){
            fillRect = true;
          }else {
            fillRect = false;
          }
        
          if (colour == 1){
            c = Color.red;
          }else if (colour == 2){
            c = Color.blue;
          }else {
            c = Color.green;
          }
        
          drawObjects[count] = new Rectangle(fillRect,c, x, y, width, height);
          count++;
        } 
      }// while
    } catch (InputMismatchException e){
      System.out.println("Unexpected input" + e); 
      System.exit(1);
    } catch (IOException ioex) {
      System.out.println("File problem: "+ ioex);
      System.exit(1);
    }
    
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}

