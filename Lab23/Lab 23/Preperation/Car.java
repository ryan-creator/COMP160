public class Car extends Vehicle{    
  private int numAirBags;    
  private int litresPerKilometre;
  
  public Car(String name, String countryOfOrigin, int lpK, int airBags){ 
    super(name, countryOfOrigin); 
    lpK = litresPerKilometre;
    airBags = numAirBags;
  } 
  public int fuelConsumption(int tripLength){
    return litresPerKilometre * tripLength;
  }    
  public String toString(){        
    return "Car with " + numAirBags + " air bags made in  " + countryOfOrigin;    
  } 
} 