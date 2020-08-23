public class LeapYear {
  
  /** method that determins if it's a leap year and prints result */
  public static void leapYear(int year) {
    if (year > 1582) {
      if (year%4 == 0 && year%100 != 0) {
        System.out.println(year+": is a leap year");
      }else if (year%100 == 0){
        if (year%400 == 0) {
          System.out.println(year+": is a leap year");
        } else {
          System.out.println(year+": is not a leap year");
        } 
      } else {
        System.out.println(year+": is not a leap year");
      }
    }else {
    System.out.println(year+": predates the Gregorian calendar");
    }
  }// method end
  
  public static void main(String[]args){
    leapYear(2014);
    leapYear(2016);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }
}