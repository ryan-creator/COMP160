import java.util.Scanner;

public class IntegerInput {
  
  public static void main(String[] args) {
    int sum = 0;
    System.out.println("Enter an integer greater than 1");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int i = num;
    if (num > 1) {
      while(num >= 2) {
        if (num % 2 == 0) {
          sum += num;
        }// if statment end
        num--;
      }// end of while statement
      System.out.println("Sum of even numbers between 2 and "+i+" inclusive is: "+sum);  
    }else {
      System.out.println("Input value must not be less than 2");
    }// if statment end
    
  }//main method end
  
}//class end