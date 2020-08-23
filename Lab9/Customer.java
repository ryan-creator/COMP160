import java.util.Scanner;

public class Customer {
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;
  
  public Customer(String name, int age, boolean student){
    this.name = name;
    child = age >= 5 && age <=16;
    this.student = student;
  }
  
  /** accessor for name */
  public String getName(){
    return name;
  }
  
  /**Accessor that returns true if the person is a child */
  public boolean isChild(){
    return child;
  }// accessor end
  
  /** Accessor that returns true if the person is a student */
  public boolean isStudent(){
    return student;
  }// accessor end
  
  /** Gets input and returns true or false */
  public void setBooked(){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    if (input.equals("Y")||input.equals("y"))
      booked = true;
    else 
      booked = false;
  }// accessor end
  
  /** Return booked */
  public String getBooked(){
    if (booked==true)
      return "Booked";
    else
      return "Not Booked";
  }
  
  /** Conform booking and price method */
  public void confirmBooking(){
    double ticketPrice = 56.0;
    double mealPrice = 30.0;
    if (student || child )
      ticketPrice = ticketPrice/2;
    else
      ticketPrice = ticketPrice*0.8;
    
    if (child )
      mealPrice = mealPrice/2;
    else
      mealPrice = mealPrice*0.9;
    double totalPrice = ticketPrice + mealPrice;
    System.out.println(getName()+"\nTicket price:$"+ticketPrice+"\nMeal Price:$"+mealPrice+"\nTotal price:$"+totalPrice+"\nConfirm booking for "+getName()+" (Y/N)");
    setBooked();
    System.out.println(getBooked()+"\n\n");
  }
  
  public void printBooked(){
    if (booked==true)
      System.out.println(getName()+" is booked.");
    }
  
}// class end