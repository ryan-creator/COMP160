import java.util.Random; 
import java.util.*;

public class SelectionSortApp {
  public static void main(String[]args){
    
    int indexOfMin = 0;
    int listSize = 100;
    int count = 0;
    
    //Makes an Array of a 100 random intergers
    ArrayList<Integer> list = new ArrayList<Integer>(listSize);
    Random random = new Random();
    for (int i = 0; i < listSize; i++){
      list.add(random.nextInt(100));
    }
 
    System.out.println(list);
    
    
    //Adds the smallest integer to the start of the list
    while(count < list.size()){
      
      if(list.indexOf)
      
      indexOfMin = list.indexOf(Collections.min(list));
      list.add(0,list.get(indexOfMin));
      count++;
    }
    
    System.out.println(list);
    System.out.println(list.get(indexOfMin));
    
  }
  
  
  
  
  
  
  /** Makes an Array of a 100 random intergers 
  public static int [] makeArray(){
    ArrayList<Integer> list = new ArrayList<Integer>(listSize);
    Random random = new Random();
    for (int i = 0; i < listSize; i++){
      list.add(random.nextInt(100));
    }
    return list;
  }*/
  
}
