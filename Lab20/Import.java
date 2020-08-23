import java.util.*;
import java.io.*;

public class Import{
  public static void main(String[]args){
    try {
      Scanner scan = new Scanner(new File("Lab20data.txt"));
      while(scan.hasNext()){
        System.out.println(scan.next());
      }
    } catch (InputMismatchException e){
      System.out.println("Unexpected input" + e); 
    } catch (IOException ioex) {
      System.out.println("File problem: "+ ioex);
    }  
  }
}
