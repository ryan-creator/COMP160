public class Boat extends Vehicle{    
  private int litresPerHour;    
  private int numberOfBerths;
  
  public Boat(String name, String countryOfOrigin, int lpH, int brths){ 
    super(name, countryOfOrigin);
    lpH = litresPerHour;
    brths = numberOfBerths; 
  } 
  public int fuelConsumption(int tripLength){
    return litresPerHour * tripLength; 
  }
    
    
    public String toString(){        
    return "Boat with " + numberOfBerths + " berths  made in  " + countryOfOrigin;    }
}  