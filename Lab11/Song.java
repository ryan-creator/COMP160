public class Song {
  private String songLine;
  
  /** Constructor */
  public Song(String sLine){
    songLine = sLine;
  }
  
  /** Returns the songline in a string */
  public String toString(){
    return songLine;
  }
  
  public void process(){
    System.out.println("Length is: "+songLine.length()); //Song line length
    System.out.println("The last character in the song line is: "+songLine.charAt(songLine.length()-1)); // Song line last character
    int i = songLine.indexOf(" ",songLine.indexOf(" ")+1); //Finds second space
    int x = songLine.indexOf(" "); // Finds first space
    
    if (i==(-1)){// print first two words on seperate line
      System.out.println(songLine.substring(0,x));
    }else{
      System.out.println(songLine.substring(0,i));
    }
    
    if (i==(-1)){// print the rest of the words on their own line
      System.out.println(songLine.substring(x+1));
    }else{
      System.out.println(songLine.substring(i+1));
    }
    
    if (i==(-1)){// print first letter of third word
      System.out.println(songLine.charAt(x+1));
    }else{
      System.out.println(songLine.charAt(i+1));
    }
    
    System.out.println(songLine.toUpperCase()); //Make it all uppercase
    System.out.println(songLine.replaceAll(" ","X"));//Replace all spaces with X
    System.out.println(songLine.indexOf("b")); //Print the index of b
    System.out.println(songLine); //Reprint songLine normally
    System.out.println(); //Spcace
  }
}