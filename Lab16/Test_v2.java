public class Test_v2{
  
  public static void main(String[]args){
    int[] dunedinTemps = {15, 12, 9, 13, 14};
    int[] aucklandTemps = {17, 15, 18, 14, 17};
    int[][]temps = {dunedinTemps, aucklandTemps};
    for (int i = 0; i < temps.length; i++){
      System.out.println(temps[i][0]);
    }
    
  }
}