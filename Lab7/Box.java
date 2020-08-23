/**  
 * Box.java
 * Lab 7, COMP160  2018
 * Stores and displays information about an individual Box.
 */

public class Box {
  private int height; // Height of box
  private int width;  // Width of box
  private int length; // Length of box
  static String owner;// Owner
  
  public Box(int h, int w, int l){
    height = h;
    width = w;
    length = l;
  }
  
  public Box(){
    height = 0;
    width = 0;
    length = 0;
  }
  
  /* Set all the sides of the box */
  public Box(int side){
    height = side;
    width = side;
    length = side;
  } 
  
  /* Sets the value of the data field title to input parameter value 
  public void setHeight(int h){
    height = h;
  }// end method
  
  /* Sets the value of the data field title to input parameter value 
  public void setWidth(int w){
    width = w;
  }// end method
  
  /* Sets the value of the data field title to input parameter value 
  public void setLength(int l){
    length = l;
  }// end method
  
  
  
  
  /* Gets Volume */
  public int getVolume(){
    return (height*width*length);
  }// end method
  
  /* Get surface Area */
  public int getSurfaceArea(){
    return ((height*width)+(length*width)+(height*length))*2;
  }// end method
  
  /* set owner name */
  public static void setOwner(String o){
    owner = o;
  }// end method
  
  /* get owners name */
  public static String getOwner(){
    return owner;
  }// end method
  
  /* Reutrns data in a String */
  public String toString(){
    return "Height is: "+height+", Width is: "+width+", Length is: "+length+", Volume is: "+getVolume()+
      " and Surface Area is: "+getSurfaceArea()+" by owner "+getOwner()+"."; 
  } // end method
}// Class end