public class RandomApp{
  public static void main(String[]args){
    RandomRange r = new RandomRange();
    int lo = RandomRange.readInt("Enter lowest value");
    int hi = RandomRange.readInt("Enter highest value");
    System.out.println("Random integer between " + lo + " and " + hi + " : " + r.randomRange(lo, hi));
  }
}