public class Average{
  public static void main(String[]args){
    double sum = 0;
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    // for loops go through each item in the array
    for (int row = 0; row < table.length; row++){
      sum = 0;
      for (int col = 0; col < table[row].length; col++){
        System.out.print(table[row][col]+" "); // prints row 
        sum = sum + table[row][col]; // adds row together
      }
      
      System.out.println("    Average : "+(sum/(table[row].length))); // prints the average
    }
  }
}