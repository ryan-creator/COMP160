public class IntCounter{
  private int [] numArray;
  
  /**The constructor*/
  public IntCounter(int [] x){
    this.numArray = x;
    for(int num: x){
      System.out.print(num+" ");
    }
    System.out.print("Array is of length: "+x.length+"\n");
  }
  /** Prints where the target is in the array */
  public void showTarget(int target){
    for(int i = 0; i < numArray.length; i++){
      if (numArray[i] == target){
        System.out.println("\tThere is a "+target+" in position "+i);
      }
    }// for end
    System.out.println(noInterger(target));
  }// method end
  
  public String noInterger(int target){
    for (final int x : numArray){
       if (x == target) {
         return "There are no "+target+"'s in this array";
       } // if end
     } // for end
    return "";
  }
}// class end