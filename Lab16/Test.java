public class Test {
  public static void main(String[]args){
    
    int cols = 4;
    int rows = 5;
    int [] [] table = new int [rows][cols];
    for (int row = 0; row < rows; row++){
      for (int col = 0; col < cols; col++){
        table[row][col] = row * col;
        
      }
    }
    for(int [] i : table){
      System.out.println();
    }
  }
}