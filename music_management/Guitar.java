package music_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  public Guitar(String colour, String material, String type, double buyingPrice, double sellingPrice) {
    super(colour, material, type, buyingPrice, sellingPrice);
  }

  public String sound() {
    return "Waooooo!";
  }



  



}