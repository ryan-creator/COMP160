import java.util.Scanner;

public class StringInput {
  
  public static void main(String []args) {
    
    int vowelCount = 0; //variable to count the vowels
    int consonantCount = 0; //variable to count the consonants
    
    System.out.println("Enter a sentence");
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println("Sentence is : "+str);
    str = str.toLowerCase();
    for (int count = 0; count < str.length(); count++) {
      if (Character.isLetter(str.charAt(count))){
        char character = str.charAt(count);
        switch (character) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            vowelCount++;
            break;
          default:
            consonantCount++;
        }// switch end   
      }// if end 
    }// for end
    System.out.println("Vowel Count: "+vowelCount);
    System.out.println("Consonaant Count : "+(consonantCount));
  }// main method end
}// class end