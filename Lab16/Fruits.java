import java.util.*;

/** Guess the fruit game */
public class Fruits{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String [] fruits = {"","",""}; // makes the array
    for(int i = 0; i < fruits.length; i++){ // Gets input from the user for the name of each fruit
      System.out.println("What would you like to call the "+(i+1)+" fruit?");
      fruits[i] = scan.nextLine();
    }
    for(String fruit_name : fruits){ // for-each loop goes through each item in the array
      System.out.println("\nGuess what fruit I am?\t"+fruit_name.substring(0,2)+"\t"+fruit_name.length()+" letters");
      String input = scan.nextLine(); // gets the guess from the user
      if(input.equals(fruit_name)){ // checks to see if they are the same
        System.out.println("Correct");
      }else{
        System.out.println("Try Again");
        while(!input.equals(fruit_name)){ // if they are not the same the while loop will repaeat the question
          System.out.println("\nGuess what fruit I am?\t"+fruit_name.substring(0,2)+"\t"+fruit_name.length()+" letters");
          input = scan.nextLine(); // updates the input varible with a new answer
          if(input.equals(fruit_name)){
            System.out.println("Correct");
          }else{
            System.out.println("Try Again");
          }
        }
      } 
    }
  }
}