public class Table {
  public static void main(String[]args){
    int rows = 1;
    int cols = 1;
    int [] [] table = new int[12][12]; // creates the table
    
    for (int row = 0; row < table.length; row++){ // puts the data in the table
      for(int col = 0; col < table[row].length; col++){
        table [row][col] = rows * cols;
        cols++;
      }
      rows++;
      cols = 1;
    } // for end
    
    for(int[] x : table){ // displays the data
      for(int y : x){
        System.out.print(y+"\t");
      }
      System.out.println();
    }
  }
}

