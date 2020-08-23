/** 
 * Lab 3, COMP160, 2018
 */

import java.util.Scanner;

public class Letter{
    private static String yours = "Yours sincerely";
    
    
    public static void main(String [] args){
        int junior = 25000;     // standard pay rate for Junior employee
        int intermediate = 35000;  // standard pay rate for Intermediate employee
        int senior = 50000;    // standard pay rate for Senior employee
        jobOffer();
        jobOffer("Teacher");
        jobOffer("Chief Cook");
        jobOffer("Student",0);
        jobOffer("Doctor",500000);
        jobOffer("Henry Hall", "Bean Counter", senior);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the applicants name");
        String name = scan.next();
        jobOffer(name, "Bean Counter", senior); 
    } // end method
    
    public static String signature(){
      String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
      return sign;
    }// end method
    
    /** displays a job offer for Cheif Cook at $25K */
    public static void jobOffer(){
        System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
        System.out.println(yours + "\n" + signature() + "\n");
    } // end method
    
    /** displays a job offer for Doctor and student */
    public static void jobOffer (String jobTitle){
      System.out.println("Dear applicant\nI wish to offer you the position of " +jobTitle + ".\nThe pay rate will be $25000 per annum.");
      System.out.println(yours + "\n" + signature() + "\n");
    } // end method
    
    /** displays a job offer for Bean Counter at $50000 */
    public static void jobOffer (String jobTitle, int payRate){
      System.out.println("Dear applicant\nI wish to offer you the position of " +jobTitle + ".\nThe pay rate will be $"+payRate+" per annum.");
      System.out.println(yours + "\n" + signature() + "\n");
    } // end method
    
    /** displays a job offer for Bean Counter at $50000 */
    public static void jobOffer (String name, String jobTitle, int payRate){
      System.out.println("Dear "+name+"\nI wish to offer you the position of " +jobTitle + ".\nThe pay rate will be $"+payRate+" per annum.");
      System.out.println(yours + "\n" + signature() + "\n");
    } // end method
    
} // end class