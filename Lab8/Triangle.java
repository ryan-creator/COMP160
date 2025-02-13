/**  
 * Triangle.java
 * Lab 8, COMP160  2018
 * Stores and displays information about an individual Triangle.
 */

import java.lang.Math;

public class Triangle {
  private String name;
  private int p1x;
  private int p1y;
  private int p2x;
  private int p2y;
  private int p3x;
  private int p3y;
  
  public Triangle(int p1x,int p1y,int p2x,int p2y,int p3x,int p3y,String name){
    this.p1x = p1x;
    this.p1y = p1y;
    this.p2x = p2x;
    this.p2y = p2y;
    this.p3x = p3x;
    this.p3y = p3y;
    this.name = name;
  }
  
  public String getName(){ // 
    return name;
  }
  /**   Returns length on 1 side */
  public double getLength1(){ 
    return Math.sqrt(Math.pow(p1x-p2x,2) + Math.pow(p1y-p2y,2));
  }
  
  public double getLength2(){ // Returns the length of the 2nd side
    return Math.sqrt(Math.pow(p3x-p2x,2) + Math.pow(p3y-p2y,2));
  }
  
  public double getLength3(){ // Returns the length of the 3rd side
    return Math.sqrt(Math.pow(p1x-p3x,2) + Math.pow(p1y-p3y,2));
  }
  
  public double sumOfLengths(){ // calculates the perimeter
    return Math.round((getLength1() + getLength2() + getLength3())*100.0)/100.0;
  }
  
  public String toString(){ // puts the data into a string to print
    return "Triangle "+getName()+" perimeter is "+sumOfLengths()+" units";
  }
  
}// class end