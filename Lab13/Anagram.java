import java.util.Scanner;

public class Anagram {
  
  /** puts string into alphabetical order and returns it */
  public static String order(String input){
    input = input.toLowerCase();
    String newstr = "";
    for(char c = 'a'; c <= 'z'; ++c){
      for(int i = 0; i < input.length(); ++i){
        if(input.charAt(i) == c){
          newstr += c;
        }// if end
      }// for end
    }// for end
    return newstr;
  }// method end
  
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first phrase");
    String phrase1 = scan.nextLine();
    System.out.println("Enter the second phrase");
    String phrase2 = scan.nextLine();
    String aphrase1 = order(phrase1);
    String aphrase2 = order(phrase2);
    System.out.println(aphrase1+" are the letters of "+phrase1+" in order");
    System.out.println(aphrase2+" are the letters of "+phrase2+" in order");
    if (aphrase1.equals(aphrase2)){ // checks if they are equal
      System.out.println(phrase1+" is an anagram of "+phrase2);
    } else {
      System.out.println(phrase1+" is not an anagram of "+phrase2);
    }
    
  }// main method end

}// class end