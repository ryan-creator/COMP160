public class Lab21App{
  public static void main(String [] args){
    B b1 = new C(3, "One", "Two");
  }
    public static class B{
      private String s;
      public B(String s){
        this.s = s;
      }
      public String getS(){
        return s;
      }
    }
    
    public static class C extends B{
      private int x;
      private String a;
      public C (int x, String a, String s){
        super(s);
        this.x = x;
        this.a = a;
        
        s = "Five";
        System.out.println("C: x is " + x);
        System.out.println("C: a is " + a);
        System.out.println("B: s is " + super.s);
        System.out.println("B: s is " + getS());
        System.out.println("C: s is " + s);
      }
    }
    
  }
