
public class BookShopApp {
  
  public static void main(String[]args){
    
    Book pi = new Book();
    pi.setTitle("Life of Pi");
    pi.setPages(348);
    pi.setPrice(28.90);
    pi.displayBook();
    
    Book mr = new Book();
    mr.setTitle("Mister Pip");
    mr.setPages(240);
    mr.setPrice(22.70);
    mr.displayBook();
    
    Book kill = new Book();
    kill.setTitle("To Kill A Mockingbird");
    kill.setPages(270);
    kill.setPrice(18.99);
    kill.displayBook();
  }
}