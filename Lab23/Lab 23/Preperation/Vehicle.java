public abstract class Vehicle{  //(Adapted from LDC Section 8.3)     
  protected String name;    
  protected String countryOfOrigin;
  
  public abstract int fuelConsumption(int tripLength);
  
  public Vehicle(String name, String countryOfOrigin){        
    this.countryOfOrigin = countryOfOrigin;        
    this.name = name;    
  } 
} 


   
