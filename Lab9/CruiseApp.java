public class CruiseApp {
  public static void main(String[]args){
// each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    customer1.confirmBooking();
    customer2.confirmBooking();
    customer3.confirmBooking();
    customer4.confirmBooking();
    customer5.confirmBooking();
    customer6.confirmBooking();
    customer7.confirmBooking();
    customer8.confirmBooking();
    customer1.printBooked();
    customer2.printBooked();
    customer3.printBooked();
    customer4.printBooked();
    customer5.printBooked();
    customer6.printBooked();
    customer7.printBooked();
    customer8.printBooked();
  }
}