import java.util.Scanner;
import java.util.Random;

public class IntCounterApp{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 3; i++){ 
      System.out.println("\nWhich number do you wish to find?");
      int input = sc.nextInt();
      IntCounter game = new IntCounter(makeArray());
      game.showTarget(input);
    }
    System.out.println("\nFinished");
  }
  
  /**Makes a array of random numbers*/
  public static int [] makeArray(){
    Random g = new Random();
    int [] x = new int [g.nextInt(6)+5];
    for(int i = 0; i < x.length; i++){
      x[i] = g.nextInt(4);
    } // for end
    return x;
  }// method end
}