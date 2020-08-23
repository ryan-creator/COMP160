import java.util.ArrayList;

public class Preperation {
  public static void main (String[]args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Jam");
    list.add("Juice");
    list.add(0,"Bread");
    System.out.println(list.size());
    //list.remove(1);
    System.out.println(list.get(1));
    
    if (list.indexOf("Juice") > 0){
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    System.out.println(list);
    
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(new Integer(3));
    list1.add(3);
    System.out.println(list1);
  }
}